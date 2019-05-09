package com.example.secureApp.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.secureApp.demo.WashermanPojo;

public interface washermanRepository extends MongoRepository<WashermanPojo,String> {


}
