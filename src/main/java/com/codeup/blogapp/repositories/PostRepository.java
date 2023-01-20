package com.codeup.blogapp.repositories;

import com.codeup.blogapp.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PostRepository extends JpaRepository<Post,Long> {
    @Query
    Post getPostById(long id);
}
