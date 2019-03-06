package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springassignment10.Customer;



public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring5.xml");
		Customer customer= (Customer)context.getBean("customer");
		System.out.println(customer);
	}


}
