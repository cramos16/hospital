package com.hospital.hospitalportal.controller;

import com.hospital.hospitalportal.entity.Appointment;
import com.hospital.hospitalportal.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {

    @Autowired
    private AppointmentRepository appointmentRepository;

    // GET all appointments
    @GetMapping
    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }

    // GET -appointment by ID
    @GetMapping("/{id}")
    public Appointment getAppointmentById(@PathVariable int id) {
        return appointmentRepository.findById(id).orElse(null);
    }

    // POST -create appointment
    @PostMapping
    public Appointment createAppointment(@RequestBody Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    // DELETE appointment
    @DeleteMapping("/{id}")
    public void deleteAppointment(@PathVariable int id) {
        appointmentRepository.deleteById(id);
    }
}