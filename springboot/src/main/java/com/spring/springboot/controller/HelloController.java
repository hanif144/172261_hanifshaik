package com.spring.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {

		
		@RequestMapping("/")
		public String index()
		{
			return "gretings from spring boot";
		}
	
}