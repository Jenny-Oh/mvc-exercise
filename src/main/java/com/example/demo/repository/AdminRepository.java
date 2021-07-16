package com.example.demo.repository;

import com.example.demo.model.AdminDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AdminRepository {
    public AdminDto findById(@Param("id") Integer id);
    public AdminDto findByName(@Param("name") String name);
}
