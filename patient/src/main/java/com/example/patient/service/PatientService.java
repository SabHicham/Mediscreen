package com.example.patient.service;

import java.util.List;
import java.util.Optional;
import com.example.patient.dto.PatientDto;
import com.example.patient.model.Patient;

public interface PatientService {
    Patient createPatient(PatientDto patientDto);
    Optional<Patient> getPatient(long patientId);
    void updatePatient(long patientId, PatientDto patientDto);
    void deletePatient(long patientId);
    List<Patient> getAllPatients();

    Patient findById(long id);
}