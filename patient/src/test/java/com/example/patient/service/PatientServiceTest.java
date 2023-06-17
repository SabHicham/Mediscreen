package com.example.patient.service;

import com.example.patient.model.Patient;
import com.example.patient.repository.PatientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PatientServiceTest {

    @Autowired
    PatientRepository patientRepository;
    @Autowired
    PatientService patientService;
    @Test
    public void updatePatientServiceTest(){
        //GIVEN
        Patient patient = new Patient("hicham","eren","845","m","paris","06");
        //WHEN
        patientRepository.save(patient);
        patient.setFirstName("eren");
        patientService.updatePatient(patient);
        //THEN
        assertEquals(patientRepository.findById(patient.getId()).get().getFirstName(), "eren");
    }

    @Test
    public void createPatientTest() {
        //given
        Patient patient = new Patient("hicham","eren","845","m","paris","06");

        //when
        patientRepository.save(patient);

        //then
        assertNotNull(patientRepository.findById(patient.getId()));
    }

}