package com.hospital.hospitalportal.repository;

import com.hospital.hospitalportal.entity.Allergies;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AllergyRepository extends JpaRepository<Allergies, Integer> {
}