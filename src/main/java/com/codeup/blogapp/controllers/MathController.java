package com.codeup.blogapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class MathController {
    @GetMapping("/add/3/and/4")
    @ResponseBody
    public Integer add() {
        return 3+4;
    }
    @GetMapping("/subtract/3/from/10")
    @ResponseBody
    public Integer subtract() {
        return 3-10;
    }
    @GetMapping("/multiply/4/and/5")
    @ResponseBody
    public Integer multiply() {
        return 4*5;
    }
    @GetMapping("/divide/6/by/3")
    @ResponseBody
    public Integer divide() {
        return 6/3;
    }
}
