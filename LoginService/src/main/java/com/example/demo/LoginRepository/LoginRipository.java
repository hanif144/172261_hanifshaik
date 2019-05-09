package com.example.demo.LoginRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.login.Login;

public interface LoginRipository  extends MongoRepository<Login, String>{

}
