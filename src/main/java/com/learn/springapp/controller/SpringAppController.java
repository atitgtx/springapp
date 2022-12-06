package com.learn.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringAppController{

    @Autowired
    private Environment env;

    
    @GetMapping(value = "/host")
    public String getHost(){
        return "Request served from Host:" + env.getProperty("HOSTNAME");
    }
    
    @GetMapping(value = "/env")
    public String getEnv(){
        return env.toString();
    }
    
}