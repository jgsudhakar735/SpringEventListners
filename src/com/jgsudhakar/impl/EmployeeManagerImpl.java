/**
 * 
 */
package com.jgsudhakar.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

import com.jgsudhakar.dto.EmployeeDTO;
import com.jgsudhakar.event.EmployeeAsyncEvent;
import com.jgsudhakar.event.EmployeeEvent;
import com.jgsudhakar.iface.EmployeeDao;
import com.jgsudhakar.iface.EmployeeManager;

/**
 * @author   :Sudhakar Tangellapalli
 * @Date     :Jun 8, 2017
 * @FileName :com.jgsudhakar.impl.EmployeeManagerImpl.java
 */
@Service("employeeManager")
public class EmployeeManagerImpl implements EmployeeManager, ApplicationEventPublisherAware
{
    @Autowired
    private EmployeeDao dao;
     
    private ApplicationEventPublisher publisher;
     
    //You must override this method; It will give you acces to ApplicationEventPublisher
    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }
     
    public EmployeeDTO createNewEmployee()
    {
        EmployeeDTO employee =  dao.createNewEmployee();
         System.out.println("Event Processing");
        //publishing the veent here
        publisher.publishEvent(new EmployeeEvent(this, "ADD", employee));
        
        publisher.publishEvent(new EmployeeEvent(this, "EDIT", employee));
        
        System.out.println("Event Processing end");
        
        publisher.publishEvent(new EmployeeAsyncEvent(this, "EmployeeAsyncEvent", employee));
        
        return employee;
    }

}
