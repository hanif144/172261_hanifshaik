package com.aop.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.main.service.ShapeService;

public class AopMain {

	public static void main(String[] args) {
	
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		ShapeService shape= ctx.getBean("shapeservice",ShapeService.class);
		System.out.println(shape.getCircle().getName());
	}

}
