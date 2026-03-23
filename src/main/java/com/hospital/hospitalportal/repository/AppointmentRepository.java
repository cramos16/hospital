package com.hospital.hospitalportal.repository;

import com.hospital.hospitalportal.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {
}