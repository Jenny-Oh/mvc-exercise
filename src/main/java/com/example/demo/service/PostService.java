package com.example.demo.service;

import com.example.demo.model.PostDto;
import com.example.demo.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    public PostRepository postRepository;
    public List<PostRepository> postRepositoryList;
    public PostService(PostRepository postRepository){
        this.postRepository=postRepository;
    }
    public List<PostDto> getPostByTitle(String title){
        return this.postRepository.findByTitle(title);

    }
    public PostDto getPostByContext(String context){
        return this.postRepository.findByContext(context);
    }
}
