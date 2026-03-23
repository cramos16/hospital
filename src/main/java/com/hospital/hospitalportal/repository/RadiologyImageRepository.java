package com.hospital.hospitalportal.repository;

import com.hospital.hospitalportal.entity.RadiologyImage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RadiologyImageRepository extends JpaRepository<RadiologyImage, Integer> {
}