package com.example.note.service;

import com.example.note.model.Note;

import java.util.List;

public interface NoteService {
    Note addNoteToPatient(Note note); // Ajouter une note à un patient
    Note getNoteById(String noteId); // Obtenir une note par son identifiant
    List<Note> getNotesByPatientId(long patientId); // Obtenir toutes les notes d'un patient
    Note updateNoteById(String noteId, Note note); // Mettre à jour une note par son identifiant
    void deleteNoteById(String noteId); // Supprimer une note par son identifiant

}
