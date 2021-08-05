package com.example.test.test;

import java.util.concurrent.TimeUnit;
 
import org.javacodegeeks.mongoes.domain.Article;
import org.javacodegeeks.mongoes.domain.ArticleElasticRepository;
import org.javacodegeeks.mongoes.domain.ArticleMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication implements CommandLineRunner {

	@Autowired
    private ArticleMongoRepository amr;
 
    @Autowired
    private ArticleElasticRepository aer;
 
    public static void main(String[] args) {
        SpringApplication.run(MongoesApplication.class, args);
    }
 
    @Override
    public void run(String... args) throws Exception {
        // insert three articles into Mongo
        amr.save(new Article("1", "Jawaharlal Nehru", "We make a tryst with destiny"));
        amr.save(new Article("2", "Martin Luther King", "I have a dream"));
        amr.save(new Article("3", "Barack Obama", "Yes, we can"));
 
        // fetch all articles from Mongo
        System.out.println("Articles found in MongoDB with findAll():");
        System.out.println("-----------------------------------------");
        Iterable<Article> articles = amr.findAll();
        articles.forEach(System.out::println);
        System.out.println();
 
        TimeUnit.SECONDS.sleep(5);
 
        // fetch all articles from Elastisearch
        System.out.println("Articles found in Elasticsearch with findAll():");
        System.out.println("-----------------------------------------------");
        articles = aer.findAll();
        articles.forEach(System.out::println);
        System.out.println();
    }

}
