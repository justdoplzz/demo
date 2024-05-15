package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.example.demo.service.UserService;
import com.example.demo.vo.UserVo;

import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UserController {

    private final UserService userService;

    // 생성자를 통해 UserSerivce를 주입
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/userList")
    public String getUserList(Model model) {
        List<UserVo> userList = userService.getUserList();
        model.addAttribute("list", userList);
        return "userList";
    }
    
}
