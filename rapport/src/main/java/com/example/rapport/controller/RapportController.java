package com.example.rapport.controller;

import com.example.rapport.model.Rapport;
import com.example.rapport.service.RiskLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/")
public class RapportController {

    @Autowired
    RiskLevelService riskLevelService;


    // Mise à jour du patient et redirection vers la page de mise à jour
    @PostMapping("/rapport/{id}")
    public Rapport getRapport(@PathVariable("id") int id) {
        Rapport rapport = riskLevelService.calculerRisk(id);
        return rapport ; // Redirige vers le rapport du patient
    }
}
