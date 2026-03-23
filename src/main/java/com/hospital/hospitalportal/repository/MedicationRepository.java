package com.hospital.hospitalportal.repository;

import com.hospital.hospitalportal.entity.Medication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicationRepository extends JpaRepository<Medication, Integer> {
}