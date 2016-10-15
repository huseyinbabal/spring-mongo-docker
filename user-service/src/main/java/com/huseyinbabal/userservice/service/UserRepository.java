package com.huseyinbabal.userservice.service;

import com.huseyinbabal.userservice.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String>{
}
