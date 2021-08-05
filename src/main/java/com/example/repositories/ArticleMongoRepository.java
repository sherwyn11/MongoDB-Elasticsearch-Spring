package com.example.test.test;
 
import org.springframework.data.mongodb.repository.MongoRepository;
 
public interface ArticleMongoRepository extends MongoRepository<Article, String> {
 
}