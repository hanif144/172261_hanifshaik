package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.LoginRepository.LoginRipository;
import com.example.demo.login.Login;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@Controller
public class LoginController 
{

	@Autowired
	LoginRipository repository;
	
	@GetMapping("/user/all")
	public List<Login> getAlldata()
	{
		return repository.findAll();
	}
	
	@PostMapping("/user/login")
	public Login validateUser(@RequestBody Login userlog) {

	List<Login> log=repository.findAll();
	for(Login dblog:log)
	{
		if(dblog.getEmail().equals(userlog.getEmail())&&dblog.getPassword().equals(userlog.getPassword())) {
			return dblog;
		}
	}
	return null;
	}
	
	@PutMapping("/user/update")
	public Login UpdateUser(@RequestBody Login login) {
		List<Login> log=repository.findAll();
		for(Login l:log) {
		if(l.getEmail().equals(login.getEmail())&&l.getPassword().equals(login.getOldpassword())) {
			return repository.save(login);
		}
		}
			return null;
	}
	
	@PutMapping("/user/forgot")
	public Login ForgotUser(@RequestBody Login login) {
		List<Login> log=repository.findAll();
		for(Login l:log) {
		if(l.getEmail().equals(login.getEmail())&&l.getPassword().equals(login.getOldpassword())) {
			return repository.save(login);
		}
		}
			return null;
	}
	
//	@PostMapping("/user/add")
//	public Login loginDetails(@RequestBody Login log) {
//		return repository.save(log);
//		
//	}
	
	@DeleteMapping("/user/delete")
	public void deleteUser(@RequestBody Login lo) {
		List<Login> log = repository.findAll();
		for(Login l:log) {
			if(l.getEmail().equals(lo.getEmail())) {
				repository.delete(lo);
			}
		}
		
	}
}

