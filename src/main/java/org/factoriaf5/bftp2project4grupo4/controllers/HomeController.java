package org.factoriaf5.bftp2project4grupo4.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

    public class HomeController {
        @GetMapping("/")
        public String home() {
            return "redirect:/home";
        }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
