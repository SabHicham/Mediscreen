package com.example.patient.repository;

import com.example.patient.model.Patient;
import com.example.patient.service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class PatientRepositoryTest {

    @Autowired
    PatientRepository patientRepository;
    @Autowired
    PatientService patientService;
    @Test
    public void shouldMapUserToDto() {
        //given
        Patient patient = new Patient("hicham","eren","845","m","paris","06");

        //when
        patientRepository.save(patient);

        //then
    }



}
