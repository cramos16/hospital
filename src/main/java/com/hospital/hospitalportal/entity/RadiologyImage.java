package com.hospital.hospitalportal.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "radiology_images")
public class RadiologyImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int image_id;

    private int patient_id;
    private String image_type;

    @Lob
    private byte[] image_data;

    private LocalDateTime upload_date;
    private String ai_diagnosis;

    // Getters and Setters

    public int getImage_id() {
        return image_id;
    }

    public void setImage_id(int image_id) {
        this.image_id = image_id;
    }

    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public String getImage_type() {
        return image_type;
    }

    public void setImage_type(String image_type) {
        this.image_type = image_type;
    }

    public byte[] getImage_data() {
        return image_data;
    }

    public void setImage_data(byte[] image_data) {
        this.image_data = image_data;
    }

    public LocalDateTime getUpload_date() {
        return upload_date;
    }

    public void setUpload_date(LocalDateTime upload_date) {
        this.upload_date = upload_date;
    }

    public String getAi_diagnosis() {
        return ai_diagnosis;
    }

    public void setAi_diagnosis(String ai_diagnosis) {
        this.ai_diagnosis = ai_diagnosis;
    }
}