package com.codeup.springblog.controllers;

import com.codeup.springblog.models.Post;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class PostController {

    @GetMapping("/posts")
    @ResponseBody
    public String showPosts() {
        return "Posts go here";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String showIndividualPost(@PathVariable int id, Model model) {
        Post post = new Post("Title goes here", "Body goes here");
        model.addAttribute("post", post);
        return "/posts/show";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String viewCreatePost() {
        return "View the form for creating an individual post";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String createPost() {
        return "Create a new post";
    }
}
