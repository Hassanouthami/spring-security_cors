package com.example.springsecurity_cors.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//   @RestController = @Controller+@ResponseBody
// @RestController :Spring know that it shouldn't look to find an mvc file
// @Controller :Sring look to find the mvc file
@Controller
public class ProjectController {

    @GetMapping
    public String hello(){
        return "main.html";
    }
    
    @PostMapping("/test")
    @ResponseBody
    //@CrossOrigin("*") //all origie is not recommand you should use a domain http://example.com
    public String test(){
        System.out.println(":( done");
        return "test !";
    }
}
