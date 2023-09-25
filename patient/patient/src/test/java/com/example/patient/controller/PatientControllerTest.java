package com.example.patient.controller;

import static org.mockito.Mockito.when;

import com.example.patient.dto.PatientDto;
import com.example.patient.model.Patient;
import com.example.patient.service.PatientService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@ExtendWith(MockitoExtension.class)
public class PatientControllerTest {

    @Mock
    private PatientService patientService;

    @InjectMocks
    private PatientController patientController;

    private MockMvc mockMvc;

    @BeforeEach
    public void setup() {
        // Créer une instance isolée du contrôleur à tester
        mockMvc = MockMvcBuilders.standaloneSetup(patientController).build();
    }

    /*@Test
    public void testGetAllPatients() throws Exception {
        // Arrange
        // Créer une liste de patients simulée pour les données de test
        List<Patient> patients = new ArrayList<>();
        patients.add(new Patient("hicham", "eren", "845", "male",
                "street", "06"));
        // Définir le comportement attendu du service mocké
        when(patientService.getAllPatients()).thenReturn(patients);




        // Agir et Vérifier
        mockMvc.perform(MockMvcRequestBuilders.get("/api/patients"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.jsonPath("$.size()").value(patients.size()))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].id").value(1))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].firstName").value("hicham"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].lastName").value("eren"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].dateOfBirth").value("845"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].sex").value("male"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].address").value("street"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].phone").value("06"));
    }*/

   /* @Test
    public void testGetPatientById_ValidId_ReturnsPatient() throws Exception {
        // Arrange
        // Identifier du patient simulé pour les données de test
        long patientId = 1L;
        // Créer un objet PatientDto simulé pour les données de test
        PatientDto patientDto = new PatientDto("hicham", "eren", "845", "male",
                "street", "06");
        // Définir le comportement attendu du service mocké
        when(patientService.getPatient(patientId)).thenReturn(patientDto);

        // Agir et Vérifier
        mockMvc.perform(MockMvcRequestBuilders.get("/api/patients/{id}", patientId))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").value(patientId))
                .andExpect(MockMvcResultMatchers.jsonPath("$.firstName").value("John"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.lastName").value("Doe"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.dateOfBirth").value("1990-05-15"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.sex").value("Male"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.address").value("123 Main St"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.phone").value("1234567890"));
    }*/
}

