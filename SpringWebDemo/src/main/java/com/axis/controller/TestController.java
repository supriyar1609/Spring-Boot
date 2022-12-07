package com.axis.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    
    ArrayList<String> fruits=new ArrayList<String>();
    
    public TestController() {
        fruits.add("apple");
        fruits.add("mongo");
        fruits.add("banana");
    }
    
    @GetMapping("/fruits")
    public List<String> getAllFruits()
    {
        return fruits;
    }
    
}