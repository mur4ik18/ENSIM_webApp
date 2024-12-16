package com.ccp.tp3.controller;

import com.ccp.tp3.model.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AddressController {
    // Autowired permet de faire l'injection de dépendance
    // C'est-à-dire que Spring va s'occuper de créer une instance de AddressRepository
    // et de l'injecter dans notre contrôleur
    @Autowired
    AddressRepository addressRepository;
    @GetMapping("/adresses")
    public String showAddresses(Model model) {
        model.addAttribute("allAddresses", addressRepository.findAll());
        // indique le nom de la template à utiliser
        return "adresses";
    }
}