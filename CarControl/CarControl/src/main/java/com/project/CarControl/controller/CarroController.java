package com.project.CarControl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.CarControl.repository.CarroRepository;

@Controller
@RequestMapping
public class CarroController {

    private CarroRepository carroRepository;


    @GetMapping
    public String index() {
        return "index";
    }

}
