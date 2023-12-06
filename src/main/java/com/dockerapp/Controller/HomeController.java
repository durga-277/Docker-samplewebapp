package com.dockerapp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {
    @GetMapping("/home")
    public String welcomeHome(){
        return "HEllo welcome to Doceker-app";
    }
    @GetMapping("/get")
    public String sayHello(){
        return "Hi dude,how are you";
    }



}
