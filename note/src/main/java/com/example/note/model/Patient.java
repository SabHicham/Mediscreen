package com.example.note.model;



import javax.persistence.*;

@Entity
@Table
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column (name = "family")
    private String family;
    @Column (name = "given")
    private String given;
    @Column (name = "sex")
    private String sex;
    @Column (name = "phone")
    private String phone;

    public Patient(String family, String given, String sex, String phone) {
        this.family = family;
        this.given = given;
        this.sex = sex;
        this.phone = phone;
    }

    public Patient() {
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getGiven() {
        return given;
    }

    public void setGiven(String given) {
        this.given = given;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
