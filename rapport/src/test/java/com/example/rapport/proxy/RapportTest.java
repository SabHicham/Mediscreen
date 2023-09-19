//package com.example.rapport.proxy;
//
//import com.example.rapport.model.Note;
//import com.example.rapport.model.Patient;
//import com.example.rapport.model.Rapport;
//import com.example.rapport.model.RiskLevel;
//import com.example.rapport.service.RiskLevelService;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.cloud.openfeign.EnableFeignClients;
//
//import java.time.LocalDateTime;
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//@SpringBootTest
////@EnableFeignClients
//public class RapportTest {
//
//    @Autowired
//    private PatientProxy patientProxy;
//
//    @Autowired
//    private NoteProxy noteProxy;
//
//    @Autowired
//    RiskLevelService riskLevelService;
//
//    @Test
//    public void testNoteCount() {
//        List<Note> notes = new ArrayList<>();
//
//        notes.add(new Note(15, "Henri", "Dutronc", "anormal", LocalDateTime.now()));
//        notes.add(new Note(15, "Henri", "Dutronc", "vertige alo la terre", LocalDateTime.now()));
//
//        assertEquals(riskLevelService.getNbDeclencheur(notes), 2);
//    }
//
//    // Patient
//    @Test
//    public void testRapportPatient1() {
//        // ajout d'un patient
//        Patient patient = patientProxy.addPatient("robert", "allo", "1997-01-01", "m");
//
//        noteProxy.createNote(new Note(patient.getId(), "Henri", "Dutronc", "Allo", LocalDateTime.now()));
//        noteProxy.createNote(new Note(patient.getId(), "Henri", "Dutronc", "Allo", LocalDateTime.now()));
//        noteProxy.createNote(new Note(patient.getId(), "Henri", "Dutronc", "Allo", LocalDateTime.now()));
//
//        // calcul du rapport
//        Rapport rapport = riskLevelService.calculerRisk((int)patient.getId());
//
//        // resultat diabétique attentsu ?
//        assertEquals(RiskLevel.None, rapport.getRiskLevel());
//    }
//
//
//    // Patient 35 ans femmes avec 2 declencheurs
//    // Resultat attentdu: BORDERLINE
//    @Test
//    public void testBorderline() throws InterruptedException {
//        Patient patient = patientProxy.addPatient("robert", "allo", "1993-01-01", "f");
//        noteProxy.createNote(new Note(patient.getId(), "Henri", "Dutronc", "Cholestérol Anticorps", LocalDateTime.now()));
//        noteProxy.createNote(new Note(patient.getId(), "Henri", "Dutronc", "Anticorps dela marina", LocalDateTime.now()));
//        noteProxy.createNote(new Note(patient.getId(), "Henri", "Dutronc", "Anticorps Fumeur", LocalDateTime.now()));
//
//        int patientId = (int) patient.getId();
//        Rapport rapport = riskLevelService.calculerRisk(patientId);
//
//        // resultat diabétique attentsu ?
//        assertEquals(RiskLevel.Borderline, rapport.getRiskLevel());
//    }
//
//    //test in danger
//    @Test
//    public void testDanger(){
//        Patient patient = patientProxy.addPatient("robert", "allo", "1997-01-01", "f");
//        noteProxy.createNote(new Note(patient.getId(),"robert", "allo", "Fumeur Cholestérol Poids Vertige Anormal", LocalDateTime.now()));
//
//        int patientId = (int) patient.getId();
//        Rapport rapport = riskLevelService.calculerRisk(patientId);
//
//        // resultat in danger attendu
//        assertEquals(RiskLevel.InDanger, rapport.getRiskLevel());
//    }
//    //test early onset
//    @Test
//    public void testEarlyOnset(){
//        Patient patient = patientProxy.addPatient("robert", "allo", "1997-01-01", "f");
//        noteProxy.createNote(new Note(patient.getId(),"robert", "allo", "Fumeur Cholestérol Poids Vertige Anormal Taille Microalbumine Hémoglobine A1C", LocalDateTime.now()));
//
//        int patientId = (int) patient.getId();
//        Rapport rapport = riskLevelService.calculerRisk(patientId);
//
//        // resultat early on set attendu
//        assertEquals(RiskLevel.EarlyOnset, rapport.getRiskLevel());
//    }
//}
