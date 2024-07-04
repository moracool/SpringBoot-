package com.luis.springboot.webapp.springboot_web.controllers;

import java.util.List;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.luis.springboot.webapp.springboot_web.models.User;

@Controller
public class UserController {

   @GetMapping("/details")
    public String details(Model model) {

        User user = new User("LUIS", "MORA", "moracool@gmail.com");

                model.addAttribute("title", "HOLA MUNDO SPRING!!");
                model.addAttribute("user", user);
                //model.addAttribute("lastname", "Mora");
               // model.addAttribute("mail", "moracool@gmail.com");
        return "details";

    }

    @GetMapping("/list")
    public String list (ModelMap model){
        //List<User> users = new ArrayList<>();
       // List<User> users = Arrays.asList(
       //     new User("LUIS", "MORA", "moracool@gmail.com"),
       //     new User("PEDRO", "PARRA", "moracool@gmail.com"),
       //     new User("MARCO", "GONZALEZ"),
        //    new User("Ailyn", "Romero", "ttt@gmail.com")
        //);

        //model.addAttribute("users",users);
        model.addAttribute("title", "LISTADO DE USUARIOS");
        return "list";
    }

    @ModelAttribute("users")
    public List<User> usersModel(){
        return Arrays.asList(
            new User("LUIS", "MORA", "moracool@gmail.com"),
            new User("PEDRO", "PARRA", "moracool@gmail.com"),
            new User("MARCO", "GONZALEZ"),
            new User("Ailyn", "Romero", "ttt@gmail.com")
        );
    }
}
