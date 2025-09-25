package com.hellin.despliegue_api_rest.controller;

import com.hellin.despliegue_api_rest.entity.Pet;
import com.hellin.despliegue_api_rest.repository.PetRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pet")
public class PetControlller {

    private PetRepository petRepository;

    public PetControlller(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @GetMapping("/list")
    public List<Pet> hello(){
        return petRepository.findAll();
    }
}
