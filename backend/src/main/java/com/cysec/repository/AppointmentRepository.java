package com.cysec.repository;

import com.cysec.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppointmentRepository
        extends JpaRepository<Appointment, Long> {

    List<Appointment> findByUserId(Long userId);

    boolean existsByIdAndUserId(Long appointmentId, Long userId);
}
