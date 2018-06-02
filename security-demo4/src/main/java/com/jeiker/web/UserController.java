package com.jeiker.web;

import com.jeiker.model.UserDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @GetMapping
    public List<UserDto> list() {
        List<UserDto> userList = new ArrayList<>();
        userList.add(new UserDto("xiao", "123456"));
        userList.add(new UserDto("jeiker", "789789"));
        return userList;
    }
}
