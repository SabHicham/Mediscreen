package com.example.patient.service;

import com.example.patient.dto.PatientDto;
import com.example.patient.model.Patient;
import com.example.patient.repository.PatientRepository;
import com.example.patient.service.impl.PatientServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@SpringBootTest
public class PatientServiceTest {
    @Mock
    private PatientRepository patientRepository;

    @InjectMocks
    private PatientServiceImpl patientService;

    @Test
    public void testCreatePatient() {
        // Crée un objet PatientDto avec des valeurs pour les attributs
        PatientDto patientDto = new PatientDto();
        patientDto.setFirstName("Hihcam");
        patientDto.setLastName("yagear");
        patientDto.setDateOfBirth("845");
        patientDto.setSex("Male");

        // Crée un objet Patient avec les mêmes valeurs que le DTO
        Patient createdPatient = new Patient();
        createdPatient.setId(1);
        createdPatient.setFirstName(patientDto.getFirstName());
        createdPatient.setLastName(patientDto.getLastName());
        createdPatient.setDateOfBirth(patientDto.getDateOfBirth());
        createdPatient.setSex(patientDto.getSex());

        // Définit le comportement du repository mocké lors de l'appel à save()
        when(patientRepository.save(any(Patient.class))).thenReturn(createdPatient);

        // Appelle la méthode createPatient() du service
        Patient result = patientService.createPatient(patientDto);

        // Vérifie que le patient créé correspond au résultat attendu
        assertEquals(createdPatient.getId(), result.getId());
        assertEquals(createdPatient.getFirstName(), result.getFirstName());
        assertEquals(createdPatient.getLastName(), result.getLastName());
        assertEquals(createdPatient.getDateOfBirth(), result.getDateOfBirth());
        assertEquals(createdPatient.getSex(), result.getSex());

        // Vérifie que la méthode save() du repository a été appelée une fois
        verify(patientRepository, times(1)).save(any(Patient.class));
    }


    @Test
    public void testGetPatient() {
        // Crée un objet Patient existant avec des valeurs pour les attributs
        Patient existingPatient = new Patient();
        existingPatient.setId(1);
        existingPatient.setFirstName("Hicham");
        existingPatient.setLastName("yagear");
        existingPatient.setDateOfBirth("845");
        existingPatient.setSex("Male");

        // Définit le comportement du repository mocké lors de l'appel à findById()
        when(patientRepository.findById(1L)).thenReturn(Optional.of(existingPatient));

        // Appelle la méthode getPatient() du service
        Optional<Patient> result = patientService.getPatient(1L);

        // Vérifie que le patient retourné correspond à celui attendu
        assertTrue(result.isPresent());
        assertEquals(existingPatient.getId(), result.get().getId());
        assertEquals(existingPatient.getFirstName(), result.get().getFirstName());
        assertEquals(existingPatient.getLastName(), result.get().getLastName());
        assertEquals(existingPatient.getDateOfBirth(), result.get().getDateOfBirth());
        assertEquals(existingPatient.getSex(), result.get().getSex());

        // Vérifie que la méthode findById() du repository a été appelée une fois
        verify(patientRepository, times(1)).findById(1L);
    }

    @Test
    public void testGetPatient_NotFound() {
        // Définit le comportement du repository mocké lors de l'appel à findById()
        when(patientRepository.findById(1L)).thenReturn(Optional.empty());

        // Appelle la méthode getPatient() du service
        Optional<Patient> result = patientService.getPatient(1L);

        // Vérifie que le résultat est vide (patient non trouvé)
        assertFalse(result.isPresent());

        // Vérifie que la méthode findById() du repository a été appelée une fois
        verify(patientRepository, times(1)).findById(1L);
    }

    /*@Test
    public void testUpdatePatient() {
        // Crée un objet PatientDto avec de nouvelles valeurs pour les attributs
        PatientDto patientDto = new PatientDto();
        patientDto.setFirstName("Jane");
        patientDto.setLastName("Smith");
        patientDto.setDateOfBirth("1995-05-05");
        patientDto.setSex("Female");

        // Crée un objet Patient existant avec des valeurs initiales pour les attributs
        Patient existingPatient = new Patient();
        existingPatient.setId(1);
        existingPatient.setFirstName("John");
        existingPatient.setLastName("Doe");
        existingPatient.setDateOfBirth("1990-01-01");
        existingPatient.setSex("Male");

        // Définit le comportement du repository mocké lors de l'appel à findById()
        when(patientRepository.findById(1L)).thenReturn(Optional.of(existingPatient));
        // Définit le comportement du repository mocké lors de l'appel à save()
        when(patientRepository.save(any(Patient.class))).thenReturn(existingPatient);

        // Appelle la méthode updatePatient() du service
        patientService.updatePatient(1, patientDto);

        // Vérifie que les attributs du patient existant ont été mis à jour avec les nouvelles valeurs
        assertEquals(patientDto.getFirstName(), existingPatient.getFirstName());
        assertEquals(patientDto.getLastName(), existingPatient.getLastName());
        assertEquals(patientDto.getDateOfBirth(), existingPatient.getDateOfBirth());
        assertEquals(patientDto.getSex(), existingPatient.getSex());

        // Vérifie que la méthode findById() du repository a été appelée une fois
        verify(patientRepository, times(1)).findById(1L);
        // Vérifie que la méthode save() du repository a été appelée une fois avec le patient mis à jour
        verify(patientRepository, times(1)).save(updatedPatient);
    }*/


}
