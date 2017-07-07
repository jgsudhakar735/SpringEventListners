/**
 * 
 */
package com.jgsudhakar.eventprocessor;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.jgsudhakar.event.EmployeeEvent;

/**
 * @author   :Sudhakar Tangellapalli
 * @Date     :Jun 8, 2017
 * @FileName :com.jgsudhakar.eventprocessor.UserEventsProcessor.java
 */
@Component
public class UserEventsProcessor
{
    @EventListener
	public void handleMyRequest(EmployeeEvent event) 
    {
        EmployeeEvent employeeEvent = (EmployeeEvent) event;
        
        try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        System.out.println("Employee handleMyRequest " + employeeEvent.getEventType() + " with details : " + employeeEvent.getEmployee()+ ":"+Thread.currentThread());
 
    }

}
