package com.example.secureApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.secureApp.demo.WashermanPojo;

import com.example.secureApp.repo.washermanRepository;


@CrossOrigin(origins="http://localhost:4200")
@RestController
public class AddController 
{
	@Autowired
	private washermanRepository repo;
	
	@PostMapping("/add")
	void addName(@RequestBody WashermanPojo washer ) {
		System.err.println(washer);
      
		repo.save(washer);
		
	}
	@GetMapping("/getallwashermannames")
	public List<WashermanPojo> getallvehicles(){
		return repo.findAll();
		
	}
}