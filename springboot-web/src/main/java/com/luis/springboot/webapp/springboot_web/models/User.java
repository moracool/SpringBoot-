package com.luis.springboot.webapp.springboot_web.models;

public class User {

    private String name;
    private String lastname;
    private String mail;
    
    public User() {
    }

    public User(String name, String lastname, String mail) {
        this.name = name;
        this.lastname = lastname;
        this.mail = mail;
    }
    public User(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;        
    }
    public String getName() {
        return name;
    }
    public String getLastname() {
        return lastname;
    }
    public String getMail() {
        return mail;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }

    
}
