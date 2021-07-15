package com.example.demo.repository;

import com.example.demo.model.BoardDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BoardRepository {
    public BoardDto findByName(@Param("boardname") String boardname);
    public BoardDto boardById(@Param("boardid") Integer boardid);
}
