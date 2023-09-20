package com.example.patient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.patient.dto.PatientDto;
import com.example.patient.model.Patient;
import com.example.patient.service.PatientService;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/patient")

public class PatientController {
    @Autowired
    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        super();
        this.patientService = patientService;
    }

    //create
    @PostMapping("/create")
<<<<<<< HEAD
    public Patient createPatient(@RequestParam("firstName") String firstName,
=======
    public void createPatient(@RequestParam("firstName") String firstName,
>>>>>>> 16d330befd98565236a72b4c1aa2bd892f4797c0
                                @RequestParam("lastName") String lastName,
                                @RequestParam("dateOfBirth") String dateOfBirth,
                                @RequestParam("sex") String sex) {
        PatientDto patientDto = new PatientDto();
        patientDto.setFirstName(firstName);
        patientDto.setLastName(lastName);
        patientDto.setDateOfBirth(dateOfBirth);
        patientDto.setSex(sex);
<<<<<<< HEAD
        return patientService.createPatient(patientDto);
=======
        patientService.createPatient(patientDto);
>>>>>>> 16d330befd98565236a72b4c1aa2bd892f4797c0
    }
    // read
    @GetMapping("/list")
    public List<Patient> getAllPatients() {
        List<Patient> patients = patientService.getAllPatients();
        return patients;
    }

    //update
    // Mise à jour du patient et redirection vers la page de mise à jour
    @PostMapping("/update/{id}")
<<<<<<< HEAD
    public void updatePatient(@PathVariable("id") Long id, @RequestBody PatientDto patientDto) {
=======
    public void updatePatient(@PathVariable("id") Long id, @ModelAttribute("patient") PatientDto patientDto) {
>>>>>>> 16d330befd98565236a72b4c1aa2bd892f4797c0
        patientService.updatePatient(id, patientDto);
        System.out.println("id patient");
    }

    //delete
<<<<<<< HEAD
    @GetMapping("/delete/{id}")
=======
    @PostMapping("/delete/{id}")
>>>>>>> 16d330befd98565236a72b4c1aa2bd892f4797c0
    public void deletePatient(@PathVariable("id") Long id) {
        patientService.deletePatient(id);
    }

    //proxy

    @GetMapping("/find/{id}")
    public ResponseEntity<Patient> getPatientById(@PathVariable int id) {

        Patient patient = patientService.findById(id);
        return ResponseEntity.ok(patient);
    }

}
