package com.example.rapport.proxy;

import com.example.rapport.model.Note;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
=======
>>>>>>> 16d330befd98565236a72b4c1aa2bd892f4797c0

import java.util.List;

@Service
<<<<<<< HEAD
@FeignClient(name = "ms-note", url = "${notes.url}")
=======
@FeignClient(name = "ms-note", url = "http://localhost:8082")
>>>>>>> 16d330befd98565236a72b4c1aa2bd892f4797c0
public interface NoteProxy {

    @GetMapping(value = "/api/notes/patient/{patientId}")
    List<Note> getNotesByPatientId (@PathVariable long patientId);
<<<<<<< HEAD

    @PostMapping(value = "/api/notes/")
    public void createNote(@RequestBody Note note);
=======
>>>>>>> 16d330befd98565236a72b4c1aa2bd892f4797c0
}