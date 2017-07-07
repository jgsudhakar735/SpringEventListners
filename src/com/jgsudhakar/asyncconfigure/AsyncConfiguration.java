/**
 * 
 */
package com.jgsudhakar.asyncconfigure;

import java.util.concurrent.Executor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

/**
 * @author   :Sudhakar Tangellapalli
 * @Date     :Jun 15, 2017
 * @FileName :com.jgsudhakar.asyncconfigure.AsyncConfiguration.java
 */
@Component
@EnableAsync(proxyTargetClass = true)
public class AsyncConfiguration  implements AsyncConfigurer {
	
	/* (non-Javadoc)
	 * @see org.springframework.scheduling.annotation.AsyncConfigurer#getAsyncExecutor()
	 */
	@Override
	public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setMaxPoolSize(1000);
        executor.initialize();
        return executor;
    }

	/* (non-Javadoc)
	 * @see org.springframework.scheduling.annotation.AsyncConfigurer#getAsyncUncaughtExceptionHandler()
	 */
	@Override
	public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
		// TODO Auto-generated method stub
		return null;
	}

}
