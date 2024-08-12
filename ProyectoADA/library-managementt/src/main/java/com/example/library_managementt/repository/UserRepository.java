package com.example.library_managementt.repository;

import com.example.library_managementt.model.document.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {
}
