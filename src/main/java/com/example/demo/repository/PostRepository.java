package com.example.demo.repository;

import com.example.demo.model.PostDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface PostRepository {
    public List<PostDto> findByTitle(@Param("post_title") String post_title);
    public List<PostDto> findByContext(@Param("context") String context);
}
