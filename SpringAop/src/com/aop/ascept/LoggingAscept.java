package com.aop.ascept;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAscept {
	
	@Before("execution(public String getName())")
	public void loggingAdvice()
	{
		System.out.println("advice run.get method called");
	}

}
