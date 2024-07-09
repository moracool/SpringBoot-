package com.moracool.curso.springboot.app.interceptors.springboot_interceptors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig  implements WebMvcConfigurer{

    @Autowired
    @Qualifier("timeInterceptor")
    private HandlerInterceptor timInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //se pueden jugar con los path permisar o quitar o prohibir acceso por el path
        //registry.addInterceptor(timInterceptor).addPathPatterns("/app/bar","/app/foo");
        registry.addInterceptor(timInterceptor).excludePathPatterns("/app/bar");
    }
    

}
