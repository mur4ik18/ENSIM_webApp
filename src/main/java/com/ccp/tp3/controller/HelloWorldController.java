package com.ccp.tp3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    // Greeting montre le nom passé en paramètre dans l'URL
    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="nameGET", required=false, defaultValue="World") String
                                   nameGET, Model model) {

        // nameGET est le paramètre GET de l'URL
        // nom template c'est la variable dans notre template et on
        // lui assigne la valeur de nameGET
        model.addAttribute("nomTemplate", nameGET);
        return "greeting";
    }
}
