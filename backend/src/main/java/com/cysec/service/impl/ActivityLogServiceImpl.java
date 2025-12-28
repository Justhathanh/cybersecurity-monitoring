package com.cysec.service.impl;

import com.cysec.model.ActivityLog;
import com.cysec.repository.ActivityLogRepository;
import com.cysec.service.ActivityLogService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ActivityLogServiceImpl implements ActivityLogService {

    private final ActivityLogRepository activityLogRepository;

    @Override
    public ActivityLog log(ActivityLog activityLog) {
        return activityLogRepository.save(activityLog);
    }

    @Override
    public List<ActivityLog> findByUserId(Long userId) {
        return activityLogRepository.findByUserId(userId);
    }

    @Override
    public List<ActivityLog> findByAction(String action) {
        return activityLogRepository.findByAction(action);
    }

    @Override
    public List<ActivityLog> findRecent(int limit) {
        return activityLogRepository
                .findAll(PageRequest.of(0, limit))
                .getContent();
    }
}
