package com.example.demo;

import com.example.mapper.UserMapper;
import com.example.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;


import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    private UserMapper userMappers;

    @Test
    public void contextLoads() {
        List<User> users = userMappers.querAll();
        for (User user:users){
            System.out.println(user.toString());
        }
    }

}
