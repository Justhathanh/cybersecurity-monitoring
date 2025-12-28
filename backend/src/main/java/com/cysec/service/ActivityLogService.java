package com.cysec.service;

import com.cysec.model.ActivityLog;
import java.util.List;

public interface ActivityLogService {

    ActivityLog log(ActivityLog activityLog);

    List<ActivityLog> findByUserId(Long userId);

    List<ActivityLog> findByAction(String action);

    List<ActivityLog> findRecent(int limit);
}
