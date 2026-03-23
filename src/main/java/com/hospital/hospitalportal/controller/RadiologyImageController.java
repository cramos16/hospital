package com.hospital.hospitalportal.controller;

import com.hospital.hospitalportal.entity.RadiologyImage;
import com.hospital.hospitalportal.repository.RadiologyImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/radiology-images")
public class RadiologyImageController {

    @Autowired
    private RadiologyImageRepository radiologyImageRepository;

    @GetMapping
    public List<RadiologyImage> getAllImages() {
        return radiologyImageRepository.findAll();
    }

    @PostMapping
    public RadiologyImage createImage(@RequestBody RadiologyImage image) {
        return radiologyImageRepository.save(image);
    }
}