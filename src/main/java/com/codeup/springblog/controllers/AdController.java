package com.codeup.springblog.controllers;

import com.codeup.springblog.repositories.AdRepository;
import com.codeup.springblog.models.Ad;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AdController {

//    private final AdRepository adRepository;
    private final AdRepository adRepository;

    public AdController(AdRepository adRepository) {
        this.adRepository = adRepository;
    }

    @GetMapping("/ads")
    @ResponseBody
    public List<Ad> showAds() {
        return adRepository.findAll();
    }

    @GetMapping("/ads/{id}")
    @ResponseBody
    public String showSingleAd(@PathVariable long id) {
        return "Showing Ad: " + id;
    }

    @PostMapping("/ads")
    @ResponseBody
    public String createAd(@RequestBody Ad newAd) {
        adRepository.save(newAd);
        return String.format("Ad created with id of: %s", newAd.getId());
    }

    @GetMapping("/name")
    @ResponseBody
    public String returnName(@RequestParam String n, @RequestParam String q) {
        return String.format("Your name is %s and your last name is %s", n, q);
    }

}
