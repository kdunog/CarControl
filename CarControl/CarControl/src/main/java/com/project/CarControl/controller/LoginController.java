package com.project.CarControl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.project.CarControl.model.Carro;
import com.project.CarControl.model.Cliente;
import com.project.CarControl.repository.CarroRepository;


@Controller
@RequestMapping
public class LoginController {

    @Autowired
    private CarroRepository carroRepository;


    @GetMapping("/")
    public String showLoginForm(Model model) {
        model.addAttribute("cliente", new Cliente());
        return "login"; 
    }

    @PostMapping("/login")
    public String login(Cliente cliente, Model model) {
        
        return "redirect:/dashboard"; // Redirect to the carros page after login
    }

}
