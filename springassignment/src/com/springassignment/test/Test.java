package com.springassignment.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springassignment.Address;
import com.springassignment.Customer;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring3.xml");
		Customer customer= (Customer)context.getBean("customer");
		System.out.println(customer);

	}

}
