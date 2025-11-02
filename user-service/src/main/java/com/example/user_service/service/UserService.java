package com.example.user_service.service;

import com.example.user_service.dto.UserDto;
import com.example.user_service.jpa.UserEntity;

public interface UserService {
    UserDto createUser(UserDto userDto);
    UserDto getUserByUserId(String userId); //개별 사용자 목록보기
    Iterable<UserEntity> getUserByAll(); //전체 사용자 목록보기
}
