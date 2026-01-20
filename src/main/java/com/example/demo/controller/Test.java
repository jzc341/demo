package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@Slf4j
@Validated
@RestController
@RequestMapping("/api/v1/test")
public class Test {

    // 确保有这个映射
    @GetMapping("/getName")
    public String getName(String name){
        System.out.println(name);
        return "test==9999" + name;
    }


}
