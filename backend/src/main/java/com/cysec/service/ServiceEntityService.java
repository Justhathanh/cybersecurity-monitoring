package com.cysec.service;

import com.cysec.model.ServiceEntity;
import java.util.List;
import java.util.Optional;

public interface ServiceEntityService {
    List<ServiceEntity> findAll();
    Optional<ServiceEntity> findById(Long id);
}
