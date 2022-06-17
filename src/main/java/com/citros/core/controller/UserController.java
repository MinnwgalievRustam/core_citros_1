package com.citros.core.controller;

import com.citros.core.dto.UserDTO;
import com.citros.core.mapper.UserMapper;
import com.citros.core.model.ResponseUser;
import com.citros.core.model.User;
import com.citros.core.service.implementation.UserServiceImpl;
import com.citros.core.service.interface_impl.UserService;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import static java.time.LocalDateTime.now;
import static org.springframework.http.HttpStatus.OK;

@Controller
@ResponseBody
@RequestMapping
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private final UserMapper userMapper;
    private final UserServiceImpl userServiceImpl;

    @GetMapping("/users/{id}")
    public UserDTO sayHello(@PathVariable Long id) {
        User user = userService.getUser(id);
        return userMapper.toDTO(user);
    }

//    @GetMapping("/list")
//    public List<User> list(){
//        return  userServiceImpl.findAll();
//    }

    @GetMapping("/list")
    public ResponseEntity<ResponseUser> getUsers() {
        return ResponseEntity.ok(
                ResponseUser.builder()
                        .timeStamp(now())
                        .data(Map.of("users", userServiceImpl.findAll()))
                        .message("Servers retrieved")
                        .status(OK)
                        .statusCode(OK.value())
                        .build()

        );
    }

}
