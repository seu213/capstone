package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public POST getPostById(Long id) {
        return postRepository.findById(id).orElse(null);
    }

    public List<POST> getAllPosts() {
        return postRepository.findAll();
    }

    public POST createPost(POST post) {
        return postRepository.save(post);
    }

    public POST updatePost(Long id, POST post) {
        POST existingPOST = postRepository.findById(id).orElse(null);
        if (existingPOST == null) {
            return null;
        }
        existingPOST.setPostTitle(post.getPostTitle());
        existingPOST.setCategory(post.getCategory());
        existingPOST.setPostCost(post.getPostCost());
        existingPOST.setPostContent(post.getPostContent());
        existingPOST.setPostImage(post.getPostImage());
        existingPOST.setUpdated(LocalDateTime.now());
        existingPOST.setStatuss(post.getStatuss());
        return postRepository.save(existingPOST);
    }

    public void deletePost(Long id) {
        postRepository.deleteById(id);
    }
}
