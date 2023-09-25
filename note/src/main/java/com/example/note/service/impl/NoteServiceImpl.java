package com.example.note.service.impl;

import com.example.note.model.Note;
import com.example.note.repository.NoteRepository;
import com.example.note.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

<<<<<<< HEAD
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
=======
import java.util.List;
>>>>>>> 16d330befd98565236a72b4c1aa2bd892f4797c0

@Service
public class NoteServiceImpl implements NoteService {
    private final NoteRepository noteRepository;

    @Autowired
    public NoteServiceImpl(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @Override
    public Note addNoteToPatient(Note note) {
<<<<<<< HEAD
        note.setId(UUID.randomUUID().toString());
        note.setDateNote(LocalDateTime.now());
=======
>>>>>>> 16d330befd98565236a72b4c1aa2bd892f4797c0
        return noteRepository.save(note); // Enregistrer la note dans la base de données
    }

    @Override
    public Note getNoteById(String noteId) {
        return noteRepository.findById(noteId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Note not found with id: " + noteId));
    }

    @Override
    public List<Note> getNotesByPatientId(long patientId) {
        return noteRepository.findByPatientId(patientId);
    }

    @Override
    public Note updateNoteById(String noteId, Note note) {
        Note existingNote = noteRepository.findById(noteId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Note not found with id: " + noteId));

        // Mettre à jour les propriétés de la note existante avec les nouvelles valeurs
        existingNote.setPatientId(note.getPatientId());
        existingNote.setFirstName(note.getFirstName());
        existingNote.setLastName(note.getLastName());
        existingNote.setNote(note.getNote());
        existingNote.setDateNote(note.getDateNote());

        return noteRepository.save(existingNote); // Enregistrer la note mise à jour dans la base de données
    }

    @Override
    public void deleteNoteById(String noteId) {
        noteRepository.deleteById(noteId);
    }

}


