package com.example.myfirstspringbootproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClass {
     @GetMapping("Hello")
     public String sayHello(){
         return "Hello Siam";
     }
}
