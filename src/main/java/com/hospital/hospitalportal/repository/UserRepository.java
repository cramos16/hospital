package com.hospital.hospitalportal.repository;

import com.hospital.hospitalportal.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}