/**
 * 
 */
package com.jgsudhakar.event;

import org.springframework.context.ApplicationEvent;

import com.jgsudhakar.dto.EmployeeDTO;

/**
 * @author   :Sudhakar Tangellapalli
 * @Date     :Jun 8, 2017
 * @FileName :com.jgsudhakar.event.EmployeeEvent.java
 */
public class EmployeeAsyncEvent extends ApplicationEvent
{
    private static final long serialVersionUID = 1L;
     
    private String eventType;
    private EmployeeDTO employee;
     
    //Constructor's first parameter must be source
    public EmployeeAsyncEvent(Object source, String eventType, EmployeeDTO employee) 
    {
        //Calling this super class constructor is necessary
        super(source);
        this.eventType = eventType;
        this.employee = employee;
    }
 
    public String getEventType() {
        return eventType;
    }
 
    public EmployeeDTO getEmployee() {
        return employee;
    }

}
