package com.springassignment8.init;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test8 {
	
	public static void main(String args[])
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("springs.xml");
		Triangle triangle= (Triangle)context.getBean("triangle");
		triangle.draw();
	}


}
