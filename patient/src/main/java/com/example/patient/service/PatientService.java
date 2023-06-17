package com.example.patient.service;

import com.example.patient.model.Patient;
import com.example.patient.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PatientService {

    @Autowired
    public PatientRepository patientRepository;

    /**
     * Create a new patient
     * @param patient the patient to create
     */
    public void createPatient (Patient patient) {
        patientRepository.save(patient);
    }

    /**
     * Get a patient by ID
     * @param id the patient ID
     * @return the patient
     */
    public Patient getById (long id) {
        return patientRepository.findById(id).orElse(null);
    }

    public void updatePatient (Patient patient) {

       Patient patient1 = getById(patient.getId());
       patient1.setFirstName(patient.getFirstName());
       patient1.setLastName(patient.getLastName());
       patient1.setBirthDate(patient.getBirthDate());
       patient1.setSex(patient.getSex());
       patient1.setAddress(patient.getAddress());
       patient1.setPhone(patient.getPhone());

       patientRepository.save(patient);
    }

}