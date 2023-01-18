package com.codeup.blogapp.repositories;

import com.codeup.blogapp.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public interface PostRepository extends JpaRepository<Post,Long> {

    @Controller
    class AdController {

        // These two next steps are often called dependency injection, where we create a Repository instance and initialize it in the controller class constructor.
        private final PostRepository adDao;

        public AdController(PostRepository adDao) {
            this.adDao = adDao;
        }

        @GetMapping("/ads")
        public String index(Model model) {
            model.addAttribute("ads", adDao.findAll());
            return "ads/index";
        }

    }

}
