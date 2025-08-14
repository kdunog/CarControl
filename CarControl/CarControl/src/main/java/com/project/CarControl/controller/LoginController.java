package com.project.CarControl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.CarControl.model.Carro;
import com.project.CarControl.repository.CarroRepository;


@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private CarroRepository carroRepository;

    @PostMapping("/login")
    public String login(Carro carro, Model model) {
        
        return "redirect:/carros"; // Redirect to the carros page after login
    }

}
