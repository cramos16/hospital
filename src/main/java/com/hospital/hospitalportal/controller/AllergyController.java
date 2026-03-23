package com.hospital.hospitalportal.controller;

import com.hospital.hospitalportal.entity.Allergies;
import com.hospital.hospitalportal.repository.AllergyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/allergies")
public class AllergyController {

    @Autowired
    private AllergyRepository allergyRepository;

    @GetMapping
    public List<Allergies> getAllAllergies() {
        return allergyRepository.findAll();
    }

    @PostMapping
    public Allergies createAllergy(@RequestBody Allergies allergy) {
        return allergyRepository.save(allergy);
    }
}