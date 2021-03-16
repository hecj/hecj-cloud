package com.hecj.service.user.controller;

import com.hecj.service.user.config.ServerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 **/
@RestController
public class HelloController {

    @Autowired
    ServerConfig serverConfig;

    @RequestMapping("hello")
    public String hello(){
        return serverConfig.getUrl()+"###"+ HelloController.class.getName();
    }
}