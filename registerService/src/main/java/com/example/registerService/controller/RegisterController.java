package com.example.registerService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.registerService.model.RegisterPojo;
import com.example.registerService.repository.RegisterRepository;
 

 
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class RegisterController {
	@Autowired
	private RegisterRepository repo;
	@PostMapping("/user/add")
	void addUser(@RequestBody RegisterPojo reg) 
	{
		repo.save(reg);
	}
	
	
	
}