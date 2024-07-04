package com.luis.springboot.webapp.springboot_web.controllers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luis.springboot.webapp.springboot_web.models.User;
import com.luis.springboot.webapp.springboot_web.models.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserRestController {


    @GetMapping("/details")
    public UserDto details() {
        
        User user = new User("LUIS", "MORA", "moracool@gmail.com");
        UserDto userDto = new UserDto();               

        userDto.setName("HOLA MUNDO SPRING!!");
        userDto.setUser(user);      
               
        return userDto;

    }

    @GetMapping("/list")
    public List<User> list(){        
        User user = new User("LUIS", "MORA", "moracool@gmail.com");
        User user2 = new User("PEDRO", "PARRA", "moracool@gmail.com");
        User user3 = new User("MARCO", "GONZALEZ", "ttt@gmail.com");

        List<User> users = Arrays.asList(user,user2,user3); //new ArrayList<>();
        //users.add(user);
        //users.add(user2);
        //users.add(user3);

        return users;

    }
   @GetMapping("/details-map")
    public Map<String, Object> detailsMap() {

        User user = new User("LUIS", "MORA", "moracool@gmail.com");

        Map<String, Object> body = new HashMap<>();
                body.put("title", "HOLA MUNDO SPRING!!");
                body.put("user", user);
               
        return body;

    }
}
