package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.mapper.UserMapper;
import com.example.demo.vo.UserVo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
    
    private final UserMapper userMapper;

    public List<UserVo> getUserList() {
        return userMapper.getUserList();
    }
}
