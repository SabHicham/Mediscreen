package com.example.rapport.controller;

import com.example.rapport.model.Rapport;
import com.example.rapport.service.RiskLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


<<<<<<< HEAD
@CrossOrigin(origins = "*")
@RestController
=======
@Controller
>>>>>>> 16d330befd98565236a72b4c1aa2bd892f4797c0
@RequestMapping("/")
public class RapportController {

    @Autowired
    RiskLevelService riskLevelService;


<<<<<<< HEAD

    @GetMapping("/rapport/{id}")
    public Rapport getRapport(@PathVariable("id") int id) {
        Rapport rapport = riskLevelService.calculerRisk(id);
        return rapport ;
=======
    // Mise à jour du patient et redirection vers la page de mise à jour
    @PostMapping("/rapport/{id}")
    public Rapport getRapport(@PathVariable("id") int id) {
        Rapport rapport = riskLevelService.calculerRisk(id);
        return rapport ; // Redirige vers le rapport du patient
>>>>>>> 16d330befd98565236a72b4c1aa2bd892f4797c0
    }
}
