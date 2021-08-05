package com.example.test.repositories;
 
import com.example.test.models.Article;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
 
public interface ArticleElasticRepository extends ElasticsearchRepository<Article, String> {
 
}