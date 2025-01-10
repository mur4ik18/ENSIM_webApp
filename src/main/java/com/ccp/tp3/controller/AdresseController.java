package com.ccp.tp3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdresseController {


    @GetMapping("/adresse")
    public String getAdresse() {
        return "adresse";
    }
}
