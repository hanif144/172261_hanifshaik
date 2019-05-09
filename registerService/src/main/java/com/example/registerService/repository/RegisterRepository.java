package com.example.registerService.repository;

	import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.registerService.model.RegisterPojo;


	public interface RegisterRepository extends MongoRepository<RegisterPojo,String>{
	  //List<Customer> findByAge(int age);
	}


	