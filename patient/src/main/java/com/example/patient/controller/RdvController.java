package com.example.patient.controller;

import com.example.patient.model.Rdv;
import com.example.patient.service.RdvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rdv")
public class RdvController {

    private final RdvService rdvService;

    @Autowired
    public RdvController(RdvService rdvService) {
        this.rdvService = rdvService;
    }

    @PostMapping
    public Rdv createRdv(@RequestBody Rdv rdv) {
        return rdvService.createRdv(rdv);
    }

    @GetMapping("/{id}")
    public Rdv getRdvById(@PathVariable Long id) {
        return rdvService.getRdvById(id);
    }

    @PutMapping("/{id}")
    public void updateRdv(@PathVariable Long id, @RequestBody Rdv rdv) {
        Rdv existingRdv = rdvService.getRdvById(id);
        if (existingRdv != null) {
            rdv.setId(existingRdv.getId());
            rdvService.updateRdv(rdv);
        }
    }

    @DeleteMapping("/{id}")
    public void deleteRdv(@PathVariable Long id) {
        rdvService.deleteRdv(id);
    }
}

