package com.codeup.blogapp;

import ch.qos.logback.core.model.Model;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DiceRoller {
private final Random random = new Random();
    @GetMapping("/roll-dice")
    public String showRoll(){
        return "roll-dice";
    }
   @PostMapping("/roll-dice")
    public String rollDice(@RequestParam(name="guess") int guess, Model model) {
        List<Integer> rolls = new ArrayList<>();
        for (int i = 0; i <5; i++) {
            rolls.add(random.nextInt(6) + 1);
        }
       int matches = 0;
       for (Integer roll : rolls) {
           if (roll == guess) {
               matches++;
           }
       }
       model.addAttribute("guess", guess + " This is what you guessed");
       model.addAttribute("rolls", rolls + " These are your rolls");
       model.addAttribute("matches", matches + " This is how many dice matches you have");
       return "roll-dice-n";
   }
}
