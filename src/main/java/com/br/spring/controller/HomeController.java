package com.br.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("home")
public class HomeController {

    @GetMapping
    public @ResponseBody String homePage(){
        return "Home Page";
    }

}
