package com.example.visa.controller;

import com.example.visa.entity.Visa;
import com.example.visa.service.VisaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/patient")
public class VisaController {

    @Autowired
    private VisaService visaService;

    @PostMapping("/")
    public Visa saveVisa(@RequestBody Visa visa) {
        return visaService.saveVisa(visa);
    }

    @GetMapping("/all")
    public String findVisa() {
        return "gelo";
    }

    @GetMapping("/{id}")
    public Visa findVisaById(@PathVariable("id") Long patientId) {
        return visaService.findVisaById(patientId);
    }

    @GetMapping("/getall")
    public List<Visa> getAllVisas() {
        return visaService.getAllVisas();
    }

}