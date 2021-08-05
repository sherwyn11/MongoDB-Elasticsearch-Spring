package com.example.test.test;
 
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
 
public interface ArticleElasticRepository extends ElasticsearchRepository<Article, String> {
 
}