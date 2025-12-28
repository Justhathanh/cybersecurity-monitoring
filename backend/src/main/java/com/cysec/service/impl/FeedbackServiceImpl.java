package com.cysec.service.impl;

import com.cysec.model.Feedback;
import com.cysec.repository.FeedbackRepository;
import com.cysec.service.FeedbackService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FeedbackServiceImpl implements FeedbackService {

    private final FeedbackRepository feedbackRepository;

    @Override
    public Feedback create(Feedback feedback) {
        return feedbackRepository.save(feedback);
    }

    @Override
    public Optional<Feedback> findByAppointmentId(Long appointmentId) {
        return feedbackRepository.findByAppointmentId(appointmentId);
    }

    @Override
    public List<Feedback> findByUserId(Long userId) {
        return feedbackRepository.findByUserId(userId);
    }

    @Override
    public Double getAverageRating() {
        return feedbackRepository.getAverageRating();
    }
}
