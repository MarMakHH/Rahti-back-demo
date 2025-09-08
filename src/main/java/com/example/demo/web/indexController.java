package com.example.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.domain.MessageRepository;

@Controller
public class indexController {

    @Autowired
    private MessageRepository repo;
    
    @GetMapping("/")
    public String getIndex(Model model) {
        model.addAttribute("messages", repo.findAll());
        return "index";
    }
}
