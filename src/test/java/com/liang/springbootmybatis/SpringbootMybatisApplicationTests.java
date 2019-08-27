package com.liang.springbootmybatis;

import com.example.SpringbootMybatisApplication;
import com.example.entity.UserEntity;
import com.example.mappers.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
//@SpringBootTest*/
//@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {SpringbootMybatisApplication.class})
public class SpringbootMybatisApplicationTests {

     @Autowired
    private UserMapper userMapper;

    @Test
    public void contextLoads() {
        System.out.println("**");
        UserEntity userInfo = userMapper.getUserInfo();
        System.out.println(userInfo);

    }

}
