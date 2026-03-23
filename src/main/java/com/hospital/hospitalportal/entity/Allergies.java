package com.hospital.hospitalportal.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "allergies")
public class Allergies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int allergy_id;

    private int patient_id;
    private String allergy_name;
    private String reaction;
    private String exposure_type;

    // Getters and Setters

    public int getAllergy_id() {
        return allergy_id;
    }

    public void setAllergy_id(int allergy_id) {
        this.allergy_id = allergy_id;
    }

    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public String getAllergy_name() {
        return allergy_name;
    }

    public void setAllergy_name(String allergy_name) {
        this.allergy_name = allergy_name;
    }

    public String getReaction() {
        return reaction;
    }

    public void setReaction(String reaction) {
        this.reaction = reaction;
    }

    public String getExposure_type() {
        return exposure_type;
    }

    public void setExposure_type(String exposure_type) {
        this.exposure_type = exposure_type;
    }
}