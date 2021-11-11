package com.codeup.springblog.controllers;


import com.codeup.springblog.models.Post;
import com.codeup.springblog.models.User;
import com.codeup.springblog.repositories.PostRepository;
import com.codeup.springblog.repositories.UserRepository;
import com.codeup.springblog.services.EmailService;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {



//    injecting a dependency
    private PostRepository postsDao;
    private UserRepository usersDao;
    private final EmailService emailService;

    public PostController(PostRepository postsDao, UserRepository usersDao, EmailService emailService) {
        this.postsDao = postsDao;
        this.usersDao = usersDao;
        this.emailService = emailService;
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
    public String viewCreatePost(Model model) {
        model.addAttribute("post", new Post());
        return "/posts/create";
    }

    @PostMapping("/posts/create")
    public String createPost(@ModelAttribute Post post) {
        User principal = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        User user = usersDao.getById(principal.getId());
        post.setUser(user);
        postsDao.save(post);
        emailService.prepareAndSend(post, post.getTitle(), post.getBody());
        return "redirect:/posts";
    }

//    @GetMapping("/posts/{id}/edit")
//    public String returnEditView(@PathVariable long id, Model viewModel) {
//        // send a edit form
//        viewModel.addAttribute("post", postsDao.getById(id));
//        return "posts/edit";
//    }
    @GetMapping("/posts/{id}/edit")
    public String viewEditPost(@PathVariable long id, Model model) {
        model.addAttribute("post", postsDao.getById(id));
        return "/posts/edit";
    }

    @PostMapping("/posts/{id}/edit")
    public String editPost(@ModelAttribute Post post) {
//        User user = usersDao.getById(1L);
//        post.setUser(user);
//        postsDao.save(post);

        Post editedPost = postsDao.getById(post.getId());
        editedPost.setTitle(post.getTitle());
        editedPost.setBody(post.getBody());
        postsDao.save(editedPost);
        return "redirect:/posts";
    }


//    @PostMapping("/posts/{id}/edit")
//    public String editIndividualPost(@PathVariable Long id, @RequestParam String title, @RequestParam String body, Model model) {
//        Post post = postsDao.getById(id);
//        post.setTitle(title);
//        post.setBody(body);
//        postsDao.save(post);
//        return "redirect:/posts";
//    }
}
