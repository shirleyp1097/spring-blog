package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class AdController {

    @GetMapping("/ads")
    @ResponseBody
    public String showAds() {
        return "Showing all ads";
    }

    @GetMapping("/ads/{id}")
    @ResponseBody
    public String showSingleAd(@PathVariable long id) {
        return "Showing Ad: " + id;
    }

    @PostMapping("/ads")
    @ResponseBody
    public String createAds() {
        return "Creating an ad";
    }

    @GetMapping("/name")
    @ResponseBody
    public String returnName(@RequestParam String n, @RequestParam String q) {
        return String.format("Your name is %s and your last name is %s", n, q);
    }

}
