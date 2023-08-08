package com.example.rapport.proxy;

import com.example.rapport.model.Patient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@EnableFeignClients
@SpringBootTest
public class PatientProxyTest {
    @Autowired
    private PatientProxy patientProxy;
    @Test
    public void patientProxyTest (){



        // on récupère le patient grace qu proxy
        Patient patient = patientProxy.getPatientById(1);

        // on s'assure qu'il y a quelque chose qui est renvoyé
        assertNotNull(patient);



    }
}
