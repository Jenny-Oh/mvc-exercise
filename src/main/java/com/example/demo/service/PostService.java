package com.example.demo.service;

import com.example.demo.model.PostDto;
import com.example.demo.repository.PostRepository;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    public PostRepository postRepository;
    public PostService(PostRepository postRepository){
        this.postRepository=postRepository;
    }
    public PostDto getBy
}
