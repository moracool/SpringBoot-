package com.luis.springboot.webapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luis.springboot.webapp.springboot_web.models.User;
import com.luis.springboot.webapp.springboot_web.models.dto.ParamDto;

@RestController
@RequestMapping("/api/var")
public class PathVariableController {

    @Value("${config.code}")
    private Integer code;

    @Value("${config.username}")
    private String username;

    @Value("${config.message}")
    private String message;

    @Value("${config.listOfValue}")
    private String[] listOfValue;

    @Value("#{ '${config.listOfValue}'.toUpperCase().split(',') }")
    private String[] valueList;

    @Value("#{${config.valuesMap}}")
    private Map<String, Object> valueMap;

    @Value("#{${config.valuesMap}.product }")
    private String productName;

    @Value("#{${config.valuesMap}.price }")
    private Long productPrice;

    @Autowired
    private Environment environment;

    @GetMapping("/baz/{message}")
    public ParamDto baz(@PathVariable String message){
        
        ParamDto param = new ParamDto();
        param.setMessage(message);
        return param;
    }

    @GetMapping("/mix/{product}/{id}")
    public Map<String, Object> mix(@PathVariable String product, @PathVariable long id){
        
        Map<String, Object> json = new HashMap<>();
            
        json.put("product", product);
        json.put("id", id);
        return json;
    }

    @PostMapping("/create")
    public User create(@RequestBody User user){
       // User user = new User();
        user.setName(user.getName().toUpperCase());
        return user;
    }

    @GetMapping("/values")
    public Map<String, Object> values(){
        Map<String, Object> json = new HashMap<>();
            
        json.put("code", code);
        json.put("username", username);
        json.put("message", message);
        json.put("messageEnviroment", environment.getProperty("config.message"));
        json.put("codeEnviroment", Integer.valueOf(environment.getProperty("config.code")));
        json.put("listOfValue", listOfValue);
        json.put("valueList", valueList);
        json.put("valueMap", valueMap);     
        json.put("productName", productName);     
        json.put("productPrice", productPrice);               
        
        return json;
    }
}
