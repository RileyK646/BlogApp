package com.codeup.blogapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class HomeController {
    @GetMapping("/home")
    @ResponseBody
    public String landing() {
        return "home";
    }

}
