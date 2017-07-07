/**
 * 
 */
package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jgsudhakar.iface.EmployeeManager;
import com.jgsudhakar.impl.EmployeeManagerImpl;

/**
 * @author   :Sudhakar Tangellapalli
 * @Date     :Jun 8, 2017
 * @FileName :com.test.TestSpringContext.java
 */
public class TestSpringContext {
	@SuppressWarnings("resource")
    public static void main(String[] args) throws Exception 
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
 
        EmployeeManager controller = context.getBean(EmployeeManagerImpl.class);
        
        controller.createNewEmployee();
        
        System.out.println("End of Main Method");
    }
}
