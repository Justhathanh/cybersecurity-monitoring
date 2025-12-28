package com.cysec.repository;

import com.cysec.model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FeedbackRepository
        extends JpaRepository<Feedback, Long> {

    Optional<Feedback> findByAppointmentId(Long appointmentId);

    boolean existsByUserIdAndAppointmentId(Long userId, Long appointmentId);

    List<Feedback> findByUserId(Long userId);

    long countByUserId(Long userId);
    double getAverageRating();
}
