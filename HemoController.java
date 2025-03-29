package com.example.Myapppication.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HemoController {

    @RequestMapping("/")
    public String Frist(){
      return("hii this APi");
    }
    
    @RequestMapping("/about")
    public String About(){
      return "my name is Raghu";
    }
}
