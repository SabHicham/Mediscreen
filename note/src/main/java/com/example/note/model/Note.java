package com.example.note.model;


<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.format.annotation.DateTimeFormat;
=======
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
>>>>>>> 16d330befd98565236a72b4c1aa2bd892f4797c0

import java.time.LocalDateTime;

@Document(collection = "notes") // Annotation pour indiquer la collection MongoDB associée
public class Note {
    @Id // Annotation pour définir l'identifiant de la note
<<<<<<< HEAD
    private String id;
=======
    private long id;
>>>>>>> 16d330befd98565236a72b4c1aa2bd892f4797c0
    @Field(value = "patientId")
    private long patientId;
    @Field(value = "firstName")
    private String firstName;
    @Field(value = "lastName")
    private String lastName;
    @Field(value = "note")
    private String note;
<<<<<<< HEAD

    @Field(value = "dateNote")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
=======
>>>>>>> 16d330befd98565236a72b4c1aa2bd892f4797c0
    private LocalDateTime dateNote;

    // Constructeurs, getters et setters

    public Note() {
    }

<<<<<<< HEAD
    public Note(String id, long patientId, String firstName, String lastName, String note, LocalDateTime dateNote) {
=======
    public Note(long id, long patientId, String firstName, String lastName, String note, LocalDateTime dateNote) {
>>>>>>> 16d330befd98565236a72b4c1aa2bd892f4797c0
        this.id = id;
        this.patientId = patientId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.note = note;
        this.dateNote = dateNote;
    }


<<<<<<< HEAD
    public String getId() {
        return id;
    }

    public void setId(String id) {
=======
    public long getId() {
        return id;
    }

    public void setId(long id) {
>>>>>>> 16d330befd98565236a72b4c1aa2bd892f4797c0
        this.id = id;
    }

    public long getPatientId() {
        return patientId;
    }

    public void setPatientId(long patientId) {
        this.patientId = patientId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public LocalDateTime getDateNote() {
        return dateNote;
    }

    public void setDateNote(LocalDateTime dateNote) {
        this.dateNote = dateNote;
    }
}
