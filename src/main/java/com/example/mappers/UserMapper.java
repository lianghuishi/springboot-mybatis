package com.example.mappers;

import com.example.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    UserEntity getUserInfo();

}
