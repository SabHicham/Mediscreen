package com.example.note.repository;

import com.example.note.model.Note;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;
import java.util.Optional;

public interface NoteRepository extends MongoRepository<Note, String> {
    List<Note> findByPatientId(long patientId); // Rechercher les notes par l'identifiant du patient

}
