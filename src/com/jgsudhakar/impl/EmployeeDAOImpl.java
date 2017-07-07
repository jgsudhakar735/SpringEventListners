/**
 * 
 */
package com.jgsudhakar.impl;

import org.springframework.stereotype.Repository;

import com.jgsudhakar.dto.EmployeeDTO;
import com.jgsudhakar.iface.EmployeeDao;

/**
 * @author   :Sudhakar Tangellapalli
 * @Date     :Jun 8, 2017
 * @FileName :com.jgsudhakar.impl.EmployeeDAOImpl.java
 */
@Repository ("employeeDao")
public class EmployeeDAOImpl implements EmployeeDao
{
    public EmployeeDTO createNewEmployee()
    {
        EmployeeDTO e = new EmployeeDTO(1,"Sudhakar","Tangellapalli","Developer");
        return e;
    }
     
    public void initBean() {
        System.out.println("Init Bean for : EmployeeDAOImpl");
    }
     
    public void destroyBean() {
        System.out.println("Init Bean for : EmployeeDAOImpl");
    }
}
