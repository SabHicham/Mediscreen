package com.example.rapport.model;


import java.time.LocalDateTime;

public class Note {

<<<<<<< HEAD
    private String id;
=======
    private long id;
>>>>>>> 16d330befd98565236a72b4c1aa2bd892f4797c0
    private long patientId;
    private String firstName;
    private String lastName;
    private String note;
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

