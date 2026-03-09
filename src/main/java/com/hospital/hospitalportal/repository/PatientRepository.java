package com.hospital.hospitalportal.repository;

import com.hospital.hospitalportal.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
}