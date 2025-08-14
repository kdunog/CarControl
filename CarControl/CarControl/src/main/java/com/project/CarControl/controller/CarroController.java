package com.project.CarControl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.CarControl.repository.CarroRepository;

@Controller
public class CarroController {

    @Autowired
    private CarroRepository carroRepository;


}
