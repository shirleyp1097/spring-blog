package com.codeup.springblog.controllers;

import com.codeup.springblog.controllers.repositories.PostRepository;
import com.codeup.springblog.controllers.repositories.UserRepository;
import com.codeup.springblog.models.Post;
import com.codeup.springblog.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class PostController {

//    injecting a dependency
    private PostRepository postsDao;
    private UserRepository usersDao;
    public PostController(PostRepository postsDao, UserRepository usersDao) {
        this.postsDao = postsDao;
        this.usersDao = usersDao;
    }


    @GetMapping("/posts")
    public String showPosts(Model model) {
        model.addAttribute("posts", postsDao.findAll());
        return "/posts/index";
    }

    @GetMapping("/posts/{id}")
    public String showIndividualPost(@PathVariable Long id, Model model) {
        model.addAttribute("post", postsDao.getById(id));
        return "/posts/show";
    }

    @GetMapping("/posts/create")
    public String viewCreatePost() {
        return "/posts/create";
    }

    @PostMapping("/posts/create")
    public String createPost(@RequestParam String title, @RequestParam String body, Model model) {
        User user = usersDao.getById(1L);
        Post post = new Post(title, body, user);
        postsDao.save(post);
        return "redirect:/posts";
    }

    @GetMapping("/posts/{id}/edit")
    public String returnEditView(@PathVariable long id, Model viewModel) {
        // send a edit form
        viewModel.addAttribute("post", postsDao.getById(id));
        return "posts/edit";
    }

    @PostMapping("/posts/{id}/edit")
    public String editIndividualPost(@PathVariable Long id, @RequestParam String title, @RequestParam String body, Model model) {
        Post post = postsDao.getById(id);
        post.setTitle(title);
        post.setBody(body);
        postsDao.save(post);
        return "redirect:/posts";
    }
}
