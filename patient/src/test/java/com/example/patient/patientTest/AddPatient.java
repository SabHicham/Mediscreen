package com.example.patient.patientTest;

import com.example.patient.model.Patient;
import com.example.patient.repository.PatientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class AddPatient {

    @Autowired
    PatientRepository patientRepository;

    @Test
    public void shouldMapUserToDto() {
        //given
        Patient patient = new Patient(1,"hicham","eren","845","m","paris","06");

        //when
        patientRepository.save(patient);

        //then
    }

}
