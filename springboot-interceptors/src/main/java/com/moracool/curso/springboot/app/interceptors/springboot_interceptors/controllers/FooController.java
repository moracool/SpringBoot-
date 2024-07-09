package com.moracool.curso.springboot.app.interceptors.springboot_interceptors.controllers;

import java.util.Collections;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class FooController {

    @GetMapping("/foo")
    public Map<String, String> foo(){
        return Collections.singletonMap("message", "Metodo foo del controlador");
    }

    @GetMapping("/bar")
    public Map<String, String> bar() {
        
        return Collections.singletonMap("message", "Metodo bar del controlador");
    }    
    
    @GetMapping("/baz")
    public Map<String, String> baz() {
        
        return Collections.singletonMap("message", "Metodo baz del controlador");
    }
}
