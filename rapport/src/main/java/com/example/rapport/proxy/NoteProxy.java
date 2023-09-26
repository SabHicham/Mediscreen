package com.example.rapport.proxy;

import com.example.rapport.model.Note;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@FeignClient(name = "ms-note", url = "${notes.url}")
public interface NoteProxy {

    @GetMapping(value = "/api/notes/patient/{patientId}")
    List<Note> getNotesByPatientId (@PathVariable long patientId);

    @PostMapping(value = "/api/notes/")
    public void createNote(@RequestBody Note note);
}