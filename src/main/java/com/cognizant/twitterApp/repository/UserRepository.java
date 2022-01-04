package com.cognizant.twitterApp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cognizant.twitterApp.model.User;

public interface UserRepository extends MongoRepository<User, String> {

}
