package com.example.serviceImpl;

import com.example.entity.UserEntity;
import com.example.mappers.UserMapper;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;

    @Override
    public UserEntity getUserInfo() {
        return userMapper.getUserInfo();
    }


}
