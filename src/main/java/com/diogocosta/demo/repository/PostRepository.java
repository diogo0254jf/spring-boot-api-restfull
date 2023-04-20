package com.diogocosta.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.diogocosta.demo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
    
}
