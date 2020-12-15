package com.projeto.codigovoluntario.controller;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JwtApplication {

    @RequestMapping("/")
    public String hello(){
        return "Hello buddy";
    }
}
