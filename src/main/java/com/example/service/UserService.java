package com.example.service;

import com.example.dto.UserDto;
import com.example.entity.User;

import java.util.List;

public interface UserService {

    void initData(UserDto userDto);
    void saveUser(UserDto userDto);

    User findByEmail(String email);

    List<UserDto> findAllUsers();
}
