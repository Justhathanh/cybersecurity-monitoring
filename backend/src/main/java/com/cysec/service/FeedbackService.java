package com.cysec.service;

import com.cysec.model.Feedback;
import java.util.List;
import java.util.Optional;

public interface FeedbackService {
    Feedback create(Feedback feedback);
    Optional<Feedback> findByAppointmentId(Long appointmentId);
    List<Feedback> findByUserId(Long userId);
    Double getAverageRating();
}
