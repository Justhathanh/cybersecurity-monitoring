package com.cysec.service.impl;

import com.cysec.model.ServiceEntity;
import com.cysec.repository.ServiceEntityRepository;
import com.cysec.service.ServiceEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ServiceEntityServiceImpl implements ServiceEntityService {

    private final ServiceEntityRepository serviceEntityRepository;

    @Override
    public List<ServiceEntity> findAll() {
        return serviceEntityRepository.findAll();
    }

    @Override
    public Optional<ServiceEntity> findById(Long id) {
        return serviceEntityRepository.findById(id);
    }
}
