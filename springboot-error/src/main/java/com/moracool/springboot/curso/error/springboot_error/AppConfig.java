package com.moracool.springboot.curso.error.springboot_error;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.moracool.springboot.curso.error.springboot_error.models.domain.User;


@Configuration
public class AppConfig {
 
    @Bean
    List<User> users() {
        List<User> users = new ArrayList<>();
        users.add(new User(1L, "Pepe", "Gonzalez"));
        users.add(new User(2L, "Luis", "Mora"));
        users.add(new User(3L, "Marco", "Musica"));
        users.add(new User(4L, "Joselo", "Chespirito"));
        users.add(new User(5L, "Francisco", "Lopez"));
        return users;
    }
}
