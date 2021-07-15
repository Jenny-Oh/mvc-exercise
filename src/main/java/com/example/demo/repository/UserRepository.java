package com.example.demo.repository;
import com.example.demo.model.UserDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface UserRepository {
    public UserDto findById(@Param("id") Integer id);
}
