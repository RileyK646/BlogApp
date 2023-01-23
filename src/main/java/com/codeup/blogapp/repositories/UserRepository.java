package com.codeup.blogapp.repositories;

import com.codeup.blogapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query
    User findByUsername(String username);
}