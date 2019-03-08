package com.dbgs.xiaozhong.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloDemo {
    @RequestMapping("/ni")
    public String tt(){
        return "ni hao , 汪仔";
    }
}
