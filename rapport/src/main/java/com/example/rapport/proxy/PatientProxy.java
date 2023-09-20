package com.example.rapport.proxy;

import com.example.rapport.model.Patient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@FeignClient(name = "ms-patient", url = "${patient.url}")
=======
@Service
@FeignClient(name = "ms-patient", url = "localhost:8081")
>>>>>>> 16d330befd98565236a72b4c1aa2bd892f4797c0
public interface PatientProxy {

    @GetMapping(value = "/patient/find/{id}")
    Patient getPatientById (@PathVariable int id);
<<<<<<< HEAD

    @PostMapping(value = "/patient/create/")
    Patient addPatient (@RequestParam("firstName") String firstName,
                     @RequestParam("lastName") String lastName,
                     @RequestParam("dateOfBirth") String dateOfBirth,
                     @RequestParam("sex") String sex);

=======
>>>>>>> 16d330befd98565236a72b4c1aa2bd892f4797c0
}
