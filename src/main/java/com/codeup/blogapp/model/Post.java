
package com.codeup.blogapp.model;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "posts")
public class Post {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String body;

    @OneToOne
    private User owner;

    public Post() {}

    public Post(long id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public void setTitle(String title){
        this.title=title;
    }
    public String getTitle() {
        return title;
    }

    public void setBody(String body) {
        this.body=body;
    }
    public String getBody() {
        return body;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}

