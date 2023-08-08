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
