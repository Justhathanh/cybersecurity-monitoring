package com.cysec.repository;

import com.cysec.model.ActivityLog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ActivityLogRepository
        extends JpaRepository<ActivityLog, Long> {

    List<ActivityLog> findByUserId(Long userId);
    List<ActivityLog> findByAction(String action);
}
