package com.ccp.tp3.controller;

import com.ccp.tp3.JObjects.ApiResponse;
import com.ccp.tp3.JObjects.Meteo;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Controller
public class MeteoController {

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @PostMapping("/meteo")
    public String getMeteo(@RequestBody String address, Model model) {
        // get from post request data
        System.out.println(address);
        // call api service
        String url = "https://api-adresse.data.gouv.fr/search/?q=" + address + "&limit=1";
        RestTemplate restTemplate = new RestTemplate();
        ApiResponse res = restTemplate.getForObject(url, ApiResponse.class);
        // get coordinates
        double x = res.features().get(0).geometry().coordinates().get(1);
        double y = res.features().get(0).geometry().coordinates().get(0);
        // call meteo service
        System.out.println(res);
        System.out.println(x + " " + y);
        // https://api.meteo-concept.com/api/ephemeride/0?token=b7d1d6d1a540b98a0ec2ea7472db82a9434066ca5e0896e49817b4546306d785

        String urlMeteo = "https://api.meteo-concept.com/api/forecast/nextHours?token=b7d1d6d1a540b98a0ec2ea7472db82a9434066ca5e0896e49817b4546306d785&latlng="+x+"," + y + "&world=false&start=0&end=1";
        Meteo data = restTemplate.getForObject(urlMeteo, Meteo.class);
        // get meteo data
        System.out.println(data);

        model.addAttribute("data", data);
        return "meteo";
    }
}
