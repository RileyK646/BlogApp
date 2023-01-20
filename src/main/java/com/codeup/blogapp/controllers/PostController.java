package com.codeup.blogapp.controllers;

import com.codeup.blogapp.repositories.PostRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
        return "create";
    }


    private final PostRepository postDao;

    public  PostController(PostRepository postDao) {
        this.postDao = postDao;
    }
    @GetMapping("/posts")
    public String index(Model model) {
      model.addAttribute("posts", postDao.findAll());
        return "/posts";
    }

}
