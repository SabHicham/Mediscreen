package com.example.note.repository;

import com.example.note.model.Note;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

import static com.mongodb.assertions.Assertions.assertNotNull;


@SpringBootTest
public class NoteRepositoryTest {

    @Autowired
    NoteRepository noteRepository;

    /*@Test
    public void shouldMapUserToDto() {
        //given
        Note patient = new Note(1, 1,"firstName", "lastName","note", LocalDateTime.now());

        //when
        noteRepository.save(patient);

        //then
        System.out.println(noteRepository.findById(patient.getId()).orElse(null).getId());
        assertNotNull(noteRepository.findById(patient.getId()).orElse(null));
    }*/



}

