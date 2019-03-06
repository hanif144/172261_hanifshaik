package com.assignment.test2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springassignment2.List;



public class Test2 {
	public static void main(String[] args) {
		
			ApplicationContext context=new ClassPathXmlApplicationContext("spring4.xml");
		 List c=(List)context.getBean("demo");
			c.show();
		}

	}


