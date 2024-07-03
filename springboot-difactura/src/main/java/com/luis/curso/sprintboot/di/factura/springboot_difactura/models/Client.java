package com.luis.curso.sprintboot.di.factura.springboot_difactura.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Client {

    @Value("${client.name}")
    private String name;

    @Value("${client.lastname}")
    private String lastame;

    @Value("${client.email}")
    private String email;

    @Value("${client.phone}")
    private String phone;

    
    public Client() {
    }
    
    public Client(String name, String lastame) {
        this.name = name;
        this.lastame = lastame;
    }

    public Client(String name, String lastame, String email, String phone) {
        this.name = name;
        this.lastame = lastame;
        this.email = email;
        this.phone = phone;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastame() {
        return lastame;
    }
    public void setLastame(String lastame) {
        this.lastame = lastame;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
}
