package com.program.myApi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.program.myApi.model.Login;

public class LoginRepository extends MongoRepository<Login, String> {

}