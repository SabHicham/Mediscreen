package com.example.rapport.proxy;

import com.example.rapport.model.Note;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
@FeignClient(name = "ms-note", url = "http://localhost:8082")
public interface NoteProxy {

    @GetMapping(value = "/api/notes/patient/{patientId}")
    List<Note> getNotesByPatientId (@PathVariable long patientId);
}