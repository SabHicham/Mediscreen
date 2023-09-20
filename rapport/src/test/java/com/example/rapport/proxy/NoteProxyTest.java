<<<<<<< HEAD
//package com.example.rapport.proxy;
//
//import com.example.rapport.model.Note;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.cloud.openfeign.EnableFeignClients;
//
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//
////@EnableFeignClients
//@SpringBootTest
//public class NoteProxyTest {
//
//    @Autowired
//    private NoteProxy noteProxy;
//
//    @Test
//    public void noteProxyTest (){
//
//        // le nombre de notes inseres pouur le test(sur talend)
//        int nombreNotesInscritSurTalend = 3;
//        // patient concerné pour les notes
//        int idPatientSurTalend = 8;
//
//        // on récupère les notes grace qu proxy
//        List<Note> notes = noteProxy.getNotesByPatientId(8);
//
//        // on s'assure qu'il y a quelque chose qui est renvoyé
//        assertNotNull(notes);
//
//        // on s'assure que le nombre de notes renvoyés = nombre de notes inscrit sur talent
//
//        assertTrue(notes.size() > 1);
//    }
//
//    @Test
//    public void testAddNote() {
//        long id = 1;
//        Note note = new Note(id, "Firstname", "Lastname", "Notes", LocalDateTime.now());
//        noteProxy.createNote(note);
//    }
//
//
//}
=======
package com.example.rapport.proxy;

import com.example.rapport.model.Note;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@EnableFeignClients
@SpringBootTest
public class NoteProxyTest {

    @Autowired
    private NoteProxy noteProxy;
    @Test
    public void noteProxyTest (){

        // le nombre de notes inseres pouur le test(sur talend)
        int nombreNotesInscritSurTalend = 3;
        // patient concerné pour les notes
        int idPatientSurTalend = 45;

        // on récupère les notes grace qu proxy
        List<Note> notes = noteProxy.getNotesByPatientId(45);

        // on s'assure qu'il y a quelque chose qui est renvoyé
        assertNotNull(notes);

        // on s'assure que le nombre de notes renvoyés = nombre de notes inscrit sur talent

        assertEquals(3, notes.size());
    }


}
>>>>>>> 16d330befd98565236a72b4c1aa2bd892f4797c0
