package com.hospital.hospitalportal.repository;

import com.hospital.hospitalportal.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
}