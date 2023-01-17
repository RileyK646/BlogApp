package com.codeup.blogapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

public class PostController {
    @RequestMapping(path = "/posts", method = RequestMethod.GET)
    @ResponseBody
    public String index(){
        return "posts index page";
    }
    @RequestMapping(path = "/posts/{id})", method = RequestMethod.GET)
    @ResponseBody
    public String post() {
        return "view and individual post";
    }
    @RequestMapping(path = "/posts/create", method = RequestMethod.GET)
    @ResponseBody
    public String view() {
        return "view the form for creating a post";
    }
    @RequestMapping(path = "/posts/create", method = RequestMethod.POST)
    @ResponseBody
    public String create() {
        return "create a new post";
    }

}
