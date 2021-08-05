package com.example.test.models;
 
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
 
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
 
@Getter
@Setter
@NoArgsConstructor
@ToString
@Document(indexName = "jcg")
public class Article {
 
    @Id
    private String id;
 
    private String title;
    private String body;
 
    public Article(String id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
    }
}