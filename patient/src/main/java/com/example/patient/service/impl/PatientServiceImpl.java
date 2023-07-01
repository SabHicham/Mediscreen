package com.example.patient.service.impl;

import com.example.patient.service.PatientService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import com.example.patient.dto.PatientDto;
import com.example.patient.model.Patient;
import com.example.patient.repository.PatientRepository;

import javax.transaction.Transactional;

@Transactional
@Service
public class PatientServiceImpl implements PatientService {
    private PatientRepository patientRepository;

    @Autowired
    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public Patient createPatient(PatientDto patientDto) {
        Patient patient = new Patient();
        BeanUtils.copyProperties(patientDto, patient);
        return patientRepository.save(patient);
    }

    @Override
    public Optional<Patient> getPatient(long patientId) {
        return patientRepository.findById(patientId);
    }

    @Override
    public void updatePatient(long patientId, PatientDto patientDto) {
        Optional<Patient> optionalPatient = patientRepository.findById(patientId);
        optionalPatient.ifPresent(patient -> {
            BeanUtils.copyProperties(patientDto, patient);
            patientRepository.save(patient);
        });
    }

    @Override
    public void deletePatient(long patientId) {
        patientRepository.deleteById(patientId);
    }

    @Override
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }
}
