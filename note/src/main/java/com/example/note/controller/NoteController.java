package com.example.note.controller;

import com.example.note.model.Note;
import com.example.note.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

<<<<<<< HEAD
@CrossOrigin(origins = "*")
=======
>>>>>>> 16d330befd98565236a72b4c1aa2bd892f4797c0
@RestController
@RequestMapping("/api/notes") // Endpoint de base pour les requêtes relatives aux notes
public class NoteController {
    private final NoteService noteService;

    @Autowired
    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @PostMapping // Endpoint pour ajouter une note à un patient
    public Note addNoteToPatient(@RequestBody Note note) {
        return noteService.addNoteToPatient(note);
    }

    @GetMapping("/{noteId}") // Endpoint pour obtenir une note par son identifiant
    public Note getNoteById(@PathVariable String noteId) {
        return noteService.getNoteById(noteId);
    }

    @GetMapping("/patient/{patientId}") // Endpoint pour obtenir toutes les notes d'un patient
    public List<Note> getNotesByPatientId(@PathVariable long patientId) {
        return noteService.getNotesByPatientId(patientId);
    }

    @PutMapping("/{noteId}") // Endpoint pour mettre à jour une note par son identifiant
    public Note updateNoteById(@PathVariable String noteId, @RequestBody Note note) {
        return noteService.updateNoteById(noteId, note);
    }

    @DeleteMapping("/{noteId}") // Endpoint pour supprimer une note par son identifiant
    public void deleteNoteById(@PathVariable String noteId) {
        noteService.deleteNoteById(noteId);
    }
}
<<<<<<< HEAD
=======

>>>>>>> 16d330befd98565236a72b4c1aa2bd892f4797c0
