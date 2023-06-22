package com.example.patient.service;

import com.example.patient.model.Rdv;
import org.springframework.stereotype.Service;

@Service
public interface RdvService {
    Rdv createRdv(Rdv rdv);
    Rdv getRdvById(Long id);
    void updateRdv(Rdv rdv);
    void deleteRdv(Long id);
}
