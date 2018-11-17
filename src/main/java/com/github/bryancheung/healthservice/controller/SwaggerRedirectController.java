package com.github.bryancheung.healthservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SwaggerRedirectController {
    @RequestMapping ("/health-service/swagger")
    public String greeting() {
        return "redirect:/swagger-ui.html";
    }
}
