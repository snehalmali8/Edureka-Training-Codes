package com.res.SringbootMongoDb.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.res.SringbootMongoDb.model.User;

public interface UserRepo extends MongoRepository<User, Integer> {

}
