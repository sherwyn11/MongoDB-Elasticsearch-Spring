package com.example.test.repositories;

import com.example.test.models.Article;
import org.springframework.data.mongodb.repository.MongoRepository;
 
public interface ArticleMongoRepository extends MongoRepository<Article, String> {
 
}