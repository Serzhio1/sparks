package com.serzhio_pet_projects.sparks.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EvaluationController {

    @GetMapping("/")
    public String index() {
        return "This is EvaluationController";
    }
}
