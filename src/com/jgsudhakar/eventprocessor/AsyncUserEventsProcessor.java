/**
 * 
 */
package com.jgsudhakar.eventprocessor;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import com.jgsudhakar.event.EmployeeAsyncEvent;

/**
 * @author   :Sudhakar Tangellapalli
 * @Date     :Jun 8, 2017
 * @FileName :com.jgsudhakar.eventprocessor.UserEventsProcessor.java
 */
@Component
public class AsyncUserEventsProcessor
{
	@Async
    @EventListener
	public void handleMyRequest(EmployeeAsyncEvent event) 
    {
		EmployeeAsyncEvent employeeEvent = (EmployeeAsyncEvent) event;
        
        try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        System.out.println("AsyncUserEventsProcessor: Employee handleMyRequest " + employeeEvent.getEventType() + " with details : " + employeeEvent.getEmployee()+ ":"+Thread.currentThread());
 
    }

}
