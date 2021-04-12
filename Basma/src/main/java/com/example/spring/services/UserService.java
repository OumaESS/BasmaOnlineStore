package com.example.spring.services;

import com.example.spring.shared.dto.UserDto;

import java.util.List;

public interface UserService {

    UserDto createUser(UserDto user);

    UserDto getUser(String email);

    UserDto getUserByUserId(String userId);

    UserDto updateUser(String id, UserDto userDto);

    void deleteUser(String userId);

    List<UserDto> getUsers(int page, int limit, String search, int status);
}
