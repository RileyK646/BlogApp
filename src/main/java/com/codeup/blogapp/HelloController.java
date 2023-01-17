package com.codeup.blogapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello from Spring";
    }

    @GetMapping("/hello/name")
    @ResponseBody
    public String sayHello(@PathVariable String name) {
        return "hello " + name + "!";
    }
    //Request mapping requires you to be specific in what you're looking for
    @RequestMapping(path = "/increment/{number}", method = RequestMethod.GET)
    @ResponseBody
    public String addOne(@PathVariable int number) {
        return number + " plus one is " + (number + 1) + "!";
jh
    }
}
