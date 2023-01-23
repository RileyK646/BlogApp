package com.codeup.blogapp.controllers;

import com.codeup.blogapp.model.Post;
import com.codeup.blogapp.model.User;
import com.codeup.blogapp.repositories.PostRepository;
import com.codeup.blogapp.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
public class PostController {
    private final PostRepository postDao;
    private final UserRepository userDao;
    public  PostController(PostRepository postDao, UserRepository userDao) {
        this.postDao = postDao;
        this.userDao = userDao;
    }
/*
    @RequestMapping(path = "/posts", method = RequestMethod.GET)
    @ResponseBody
    public String index(){
        return "post/index";
    }
*/
@GetMapping(path = "/posts")
public String viewPost(Model model) {
    List<Post> posts = postDao.findAll();
    model.addAttribute("posts", posts);
    return "posts/index";
}

    @RequestMapping(path = "/posts/{id})", method = RequestMethod.GET)
    @ResponseBody
    public String post() {
        return "posts";
    }





    @GetMapping(path = "/posts/create")
    public String showCreateForm(Model model) {
        model.addAttribute("post", new Post());
        return "posts/create";
    }

   @PostMapping("/ads/create")
   public String createAd(@RequestParam( name = "title") String title, @RequestParam(name = "body") String body) {
       Post postToCreate = new Post();
       User user = userDao.getReferenceById(1L);
       postToCreate.setBody(body);
       postToCreate.setTitle(title);
       postToCreate.setUser(user);
       postDao.save(postToCreate);



       return "redirect:/posts";
   }


}
