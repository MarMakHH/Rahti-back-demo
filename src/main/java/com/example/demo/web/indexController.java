package com.example.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.domain.MessageRepository;

@Controller
public class indexController {

    @Autowired
    private MessageRepository repo;

    @Autowired
    private Environment env;
    
    @GetMapping("/")
    public String getIndex(Model model) {
        model.addAttribute("messages", repo.findAll());
        model.addAttribute("secret", env.getProperty("my.secret"));
        return "index";
    }
}
