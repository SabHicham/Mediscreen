package com.example.rapport.model;


import java.time.LocalDateTime;

public class Note {

    private String id;
    private long patientId;
    private String firstName;
    private String lastName;
    private String note;
    private LocalDateTime dateNote;

    // Constructeurs, getters et setters

    public Note() {
    }

    public Note(String id, long patientId, String firstName, String lastName, String note, LocalDateTime dateNote) {
        this.id = id;
        this.patientId = patientId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.note = note;
        this.dateNote = dateNote;
    }

    public Note(long patientId, String firstName, String lastName, String note, LocalDateTime dateNote) {
        this.id = id;
        this.patientId = patientId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.note = note;
        this.dateNote = dateNote;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

