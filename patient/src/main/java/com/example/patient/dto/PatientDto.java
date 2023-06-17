package com.example.patient.dto;


public class PatientDto {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String sex;
    private String address;
    private String phone;

    public PatientDto() {
        // Constructeur par défaut
    }

    public PatientDto(String firstName, String lastName, String dateOfBirth, String sex, String address, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.address = address;
        this.phone = phone;
    }
}
