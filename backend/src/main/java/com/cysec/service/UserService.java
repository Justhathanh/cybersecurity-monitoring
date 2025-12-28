package com.cysec.service;

import com.cysec.model.User;
import java.util.List;
import java.util.Optional;

public interface UserService {
    User create(User user);
    Optional<User> findById(Long id);
    Optional<User> findByUsername(String username);
    List<User> findAll();
    User update(User user);
    void delete(Long id);
}
