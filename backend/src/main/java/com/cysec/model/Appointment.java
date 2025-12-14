package com.cysec.model;


import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity @Data @Builder @NoArgsConstructor @AllArgsConstructor
public class Appointment {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToMany
    private List<ServiceEntity> services;

    private LocalDateTime createdAt;
    private LocalDateTime appointmentTime;

    private String status;
}
