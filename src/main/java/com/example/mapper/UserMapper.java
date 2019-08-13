package com.example.mapper;

import com.example.pojo.User;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface UserMapper{
    /**
     * @return List<User>
     */
    List<User> querAll();
}
