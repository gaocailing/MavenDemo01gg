package com.example.mavendemo01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    public String hello(){
        return "hello";
    }
}
