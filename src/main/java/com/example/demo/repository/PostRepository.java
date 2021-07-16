package com.example.demo.repository;

import com.example.demo.model.PostDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
public interface PostRepository {
    public PostDto findByTitle(@Param("post_title") String title);
    public PostDto findByContext(@Param("context") String context);
}
