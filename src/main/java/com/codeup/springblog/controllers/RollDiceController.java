package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Random;

@Controller
public class RollDiceController {

    @GetMapping("/rolldice")
    public String getDiceRoll() {
        return "diceRoll";
    }

    @GetMapping("/rolldice/{guess}")
    public String displayGuess(@PathVariable int guess, Model model) {
        int diceRoll = getRandomNumberUsingNextInt(1, 7);
        model.addAttribute("guess", guess);
        model.addAttribute("diceRoll", diceRoll);
        return "diceRoll";
    }

    public int getRandomNumberUsingNextInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
}
