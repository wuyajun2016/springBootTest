package com.example.jacocotest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

    @RequestMapping("/hello")
    public void hello() {
        System.out.println(1);
        for(int i=0;i<2;i++){
            System.out.println(2);
        }
    }

}
