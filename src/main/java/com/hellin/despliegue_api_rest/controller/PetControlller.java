package com.hellin.despliegue_api_rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetControlller {

    @GetMapping
    public String hello(){
        return "Hello World";
    }
}
