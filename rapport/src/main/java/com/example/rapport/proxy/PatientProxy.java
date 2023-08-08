package com.example.rapport.proxy;

import com.example.rapport.model.Patient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@Service
@FeignClient(name = "ms-patient", url = "localhost:8081")
public interface PatientProxy {

    @GetMapping(value = "/patient/find/{id}")
    Patient getPatientById (@PathVariable int id);
}
