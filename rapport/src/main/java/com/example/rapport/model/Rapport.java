package com.example.rapport.model;



public class Rapport {

    private String lastName;
    private String firstName;
    private String dateOfBirth;
    private String sex;
    private RiskLevel riskLevel;

    public Rapport() {
    }

    public Rapport(String lastName, String firstName, String dateOfBirth, String sex, RiskLevel riskLevel) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.riskLevel = riskLevel;
    }
}
