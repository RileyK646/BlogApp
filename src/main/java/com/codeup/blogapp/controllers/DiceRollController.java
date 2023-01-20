
package com.codeup.blogapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Random;

@Controller
public class DiceRollController {

    @GetMapping("/roll-dice")
    public String showDice() {
        return "diceRoll";
    }

   @GetMapping ("/roll-dice/{n}")
    public String rollDice(@PathVariable int n, Model model) {
       Random random = new Random();
        int roll = random.nextInt(6)+1;
        boolean match = n == roll;
       model.addAttribute("guess", n);
       model.addAttribute("roll", roll);
      model.addAttribute("match",match);
       return "dice-results";
   }
}

