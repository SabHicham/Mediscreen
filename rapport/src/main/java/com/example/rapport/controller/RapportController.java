package com.example.rapport.controller;

import com.example.rapport.model.Rapport;
import com.example.rapport.service.RiskLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/")
public class RapportController {

    @Autowired
    RiskLevelService riskLevelService;



    @GetMapping("/rapport/{id}")
    public Rapport getRapport(@PathVariable("id") int id) {
        Rapport rapport = riskLevelService.calculerRisk(id);
        return rapport ;
    }
}
