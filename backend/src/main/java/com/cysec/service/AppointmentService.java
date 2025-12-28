package com.cysec.service;

import com.cysec.model.Appointment;
import java.util.List;
import java.util.Optional;

public interface AppointmentService {
    Appointment create(Appointment appointment);
    Optional<Appointment> findById(Long id);
    List<Appointment> findByUserId(Long userId);
    List<Appointment> findAll();
    void delete(Long id);
}
