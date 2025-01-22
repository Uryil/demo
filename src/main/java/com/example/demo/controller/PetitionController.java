package com.example.demo.controller;


import com.example.demo.entity.Petition;
import com.example.demo.service.PetitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/petitions")
public class PetitionController {
    @Autowired
    private PetitionService petitionService;

    @GetMapping
    public List<Petition> getAllPetitions() {
        return petitionService.getAllPetitions();
    }

    @PostMapping
    public Petition createPetition(@RequestBody Petition petition) {
        return petitionService.createPetition(petition);
    }
}

