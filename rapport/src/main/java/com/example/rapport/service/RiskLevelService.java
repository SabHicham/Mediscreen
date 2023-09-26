package com.example.rapport.service;


import com.example.rapport.model.Note;
import com.example.rapport.model.Patient;
import com.example.rapport.model.Rapport;
import com.example.rapport.model.RiskLevel;
import com.example.rapport.proxy.NoteProxy;
import com.example.rapport.proxy.PatientProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RiskLevelService {

 @Autowired PatientProxy patientProxy;
 @Autowired NoteProxy noteProxy;

    public Rapport calculerRisk(int patientId) {
        // recupère ton patient
        Patient patient = patientProxy.getPatientById(patientId);

        // recupère les notes
        List<Note> notes = noteProxy.getNotesByPatientId(patientId);
        // calcule declencheurs
        long nbDeclencheur = getNbDeclencheur(notes);

        // calcule age
        long agePatient = getPatientAge(patient);


        // donnne le niveau de risk selon les regles et les informations a dispoition
        //None
        RiskLevel riskLevel = RiskLevel.None;


        // Borderline
        if (agePatient>=30 &&nbDeclencheur>2 ){
            riskLevel = RiskLevel.Borderline;
        }

        // In Danger
        boolean hommeMoinsTrentAnsDanger = patient.getSex().equals("m") && agePatient<30 && nbDeclencheur>3;
        boolean femmeMoinsTrentAnsDanger = patient.getSex().equals("f") && agePatient<30 && nbDeclencheur>4;
        boolean patientPlusTrentAnsDanger = agePatient>30 &&nbDeclencheur>6;

        if (hommeMoinsTrentAnsDanger || femmeMoinsTrentAnsDanger || patientPlusTrentAnsDanger) {
            riskLevel = RiskLevel.InDanger;
        }

        // Early onset
        boolean hommeMoinsTrentAnsEarly = patient.getSex().equals("m") && agePatient<30 && nbDeclencheur>5;
        boolean femmeMoinsTrentAnsEarly = patient.getSex().equals("f") && agePatient<30 && nbDeclencheur>7;
        boolean patientPlusTrentAnsEarly = agePatient>30 &&nbDeclencheur>8;

        if (hommeMoinsTrentAnsEarly || femmeMoinsTrentAnsEarly || patientPlusTrentAnsEarly) {
            riskLevel = RiskLevel.EarlyOnset;
        }

        //
        Rapport rapport = new Rapport(patient.getLastName(), patient.getFirstName(), patient.getDateOfBirth(), patient.getSex(), riskLevel);

        return rapport;
    }

    //public TYPE_RETOUR NOM_FONCTION(PARAMATRE_ENTREE_FONCTION) {
    //    return VARIABLE;
    //} Note1, Note2, Note3
     public long getNbDeclencheur(List<Note> notes) {
         String[] motsDeclencheurs = new String[] {"Hémoglobine A1C",
                 "Microalbumine",
                 "Taille",
                 "Poids",
                 "Fumeur",
                 "Anormal",
                 "Cholestérol",
                 "Vertige",
                 "Rechute",
                 "Réaction",
                 "Anticorps"};

         List<String> declencheursFound = new ArrayList<>();

        for(Note note: notes) {
            for(String declencheur: motsDeclencheurs) {
                if(note.getNote().toLowerCase().contains(declencheur.toLowerCase()) && !declencheursFound.contains(declencheur.toLowerCase())) {
                    declencheursFound.add(declencheur.toLowerCase());
                }
            }
        }

         return declencheursFound.size();
    }

    public long getPatientAge (Patient patient) {
        return ChronoUnit.YEARS.between(LocalDate.parse(patient.getDateOfBirth()), LocalDate.now());
    }



}

