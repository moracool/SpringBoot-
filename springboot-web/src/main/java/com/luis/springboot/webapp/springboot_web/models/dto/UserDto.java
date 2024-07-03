package com.luis.springboot.webapp.springboot_web.models.dto;

import com.luis.springboot.webapp.springboot_web.models.User;

public class UserDto {

    private String name;
    private User user;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
        
}
