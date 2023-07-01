package com.example.patient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.patient.dto.PatientDto;
import com.example.patient.model.Patient;
import com.example.patient.service.PatientService;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/")
public class PatientController {
    @Autowired
    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        super();
        this.patientService = patientService;
    }


    @GetMapping("/services")
    public String getServices(Model model) {
        List<Patient> patients = patientService.getAllPatients();
        model.addAttribute("patients", patients);
        return "services.html";
    }

    @PostMapping("/services")
    public String createPatient(@RequestParam("firstName") String firstName,
                                @RequestParam("lastName") String lastName,
                                @RequestParam("dateOfBirth") String dateOfBirth,
                                @RequestParam("sex") String sex) {
        PatientDto patientDto = new PatientDto();
        patientDto.setFirstName(firstName);
        patientDto.setLastName(lastName);
        patientDto.setDateOfBirth(dateOfBirth);
        patientDto.setSex(sex);
        patientService.createPatient(patientDto);
        return "redirect:/services";
    }

    @GetMapping("/services/{id}")
    public String getPatient(@PathVariable("id") Long id, Model model) {
        Optional<Patient> patient = patientService.getPatient(id);
        model.addAttribute("patient", patient);
        return "services.html";
    }

    @PostMapping("/services/{id}")
    public String updatePatient(@PathVariable("id") Long id,
                                @RequestParam("firstName") String firstName,
                                @RequestParam("lastName") String lastName,
                                @RequestParam("dateOfBirth") String dateOfBirth,
                                @RequestParam("sex") String sex) {
        PatientDto patientDto = new PatientDto();
        patientDto.setFirstName(firstName);
        patientDto.setLastName(lastName);
        patientDto.setDateOfBirth(dateOfBirth);
        patientDto.setSex(sex);
        patientService.updatePatient(id, patientDto);
        return "redirect:/services";
    }

    @GetMapping("/services/{id}/edit")
    public String showEditForm(@PathVariable("id") Long id, Model model) {
        Optional<Patient> patient = patientService.getPatient(id);

        if (patient.isPresent()) {
            model.addAttribute("patient", patient.get());
            return "updatePatient";
        } else {
            return "redirect:/services";
        }
    }


    @PostMapping("/services/{id}/delete")
    public String deletePatient(@PathVariable("id") Long id) {
        patientService.deletePatient(id);
        return "redirect:/services";
    }

    //autres pages
    @GetMapping("/about")
    public String showAboutPage() {
        return "about.html";
    }

    @GetMapping("/new_blog")
    public String showNewBlogPage() {
        return "new_blog.html";
    }

    @GetMapping("/resources")
    public String showResourcesPage() {
        return "resources.html";
    }

}
