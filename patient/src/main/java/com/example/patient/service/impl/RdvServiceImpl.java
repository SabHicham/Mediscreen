package com.example.patient.service.impl;

import com.example.patient.model.Rdv;
import com.example.patient.repository.RdvRepository;
import com.example.patient.service.RdvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RdvServiceImpl implements RdvService {

    private final RdvRepository rdvRepository;

    @Autowired
    public RdvServiceImpl(RdvRepository rdvRepository) {
        this.rdvRepository = rdvRepository;
    }

    @Override
    public Rdv createRdv(Rdv rdv) {
        return rdvRepository.save(rdv);
    }

    @Override
    public Rdv getRdvById(Long id) {
        return rdvRepository.findById(id).orElse(null);
    }

    @Override
    public void updateRdv(Rdv rdv) {
        rdvRepository.save(rdv);
    }

    @Override
    public void deleteRdv(Long id) {
        rdvRepository.deleteById(id);
    }
}

