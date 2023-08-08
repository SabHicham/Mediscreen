package com.example.note.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@Document(collection = "notes") // Annotation pour indiquer la collection MongoDB associée
public class Note {
    @Id // Annotation pour définir l'identifiant de la note
    private long id;
    @Field(value = "patientId")
    private long patientId;
    @Field(value = "firstName")
    private String firstName;
    @Field(value = "lastName")
    private String lastName;
    @Field(value = "note")
    private String note;
    private LocalDateTime dateNote;

    // Constructeurs, getters et setters

    public Note() {
    }

    public Note(long id, long patientId, String firstName, String lastName, String note, LocalDateTime dateNote) {
        this.id = id;
        this.patientId = patientId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.note = note;
        this.dateNote = dateNote;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
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
