package com.luis.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.luis.springboot.webapp.springboot_web.models.dto.ParamDto;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/params")
public class RequesrParamsController {

    @GetMapping("/foo")
    public  ParamDto foo(@RequestParam(required = false, defaultValue = "Sin mensaje") String message){
        ParamDto param = new ParamDto();
        param.setMessage(message);

        return param;
    }

    @GetMapping("/bar")
    public  ParamDto bar (@RequestParam(required = false, defaultValue = "Sin mensaje") String text,
                            @RequestParam Integer code){
        ParamDto param = new ParamDto();
        param.setMessage(text);
        param.setCode(code);
        return param;
    }

    @GetMapping("/request")
    public  ParamDto request (HttpServletRequest request){
        Integer code = 99;
        try {
            code = Integer.parseInt(request.getParameter("code"));
        } catch (NumberFormatException e) {
            // TODO: handle exception
        }
        ParamDto param = new ParamDto();
        param.setMessage(request.getParameter("text"));
        param.setCode(code);
        return param;
    }

}
