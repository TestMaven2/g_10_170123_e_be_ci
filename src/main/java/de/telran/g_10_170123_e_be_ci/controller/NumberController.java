package de.telran.g_10_170123_e_be_ci.controller;

import de.telran.g_10_170123_e_be_ci.service.NumberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/number")
public class NumberController {

    private NumberService service;

    public NumberController(NumberService service) {
        this.service = service;
    }

    @GetMapping
    public int getNumber() {
        return service.getNumber();
    }
}