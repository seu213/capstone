package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<POST, Long> {
}
