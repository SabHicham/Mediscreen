package com.example.note.patientTest;

import com.example.note.model.Patient;
import com.example.note.repository.PatientRepository;
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
        Patient patient = new Patient("h","h","h","h");

        //when
        patientRepository.save(patient);

        //then


    }

}
