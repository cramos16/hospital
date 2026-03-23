package com.hospital.hospitalportal.repository;

import com.hospital.hospitalportal.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}