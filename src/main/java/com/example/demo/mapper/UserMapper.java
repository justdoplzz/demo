package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.vo.UserVo;

@Mapper     // Mybatis mapper.xml 에 기재된 SQL을 호출하기 위한 인터페이스
public interface UserMapper {

    List<UserVo> getUserList();
    
}
