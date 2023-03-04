package com.example.Deploy_02.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/sum")
public class SumController {


    @GetMapping("/get")
    public Integer getSumNumber(){

        Random random = new Random();
        Integer firstNum = random.nextInt(1, 10);
        Integer secondNum = random.nextInt(1, 10);

        return firstNum + secondNum;
    }
}
