package com.cysec.repository;

import com.cysec.model.ServiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceEntityRepository
        extends JpaRepository<ServiceEntity, Long> {
}
