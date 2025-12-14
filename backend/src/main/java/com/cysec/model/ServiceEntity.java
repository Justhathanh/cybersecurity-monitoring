package com.cysec.model;

import jakarta.persistence.*;


import lombok.*;

@Entity @Data @Builder @NoArgsConstructor @AllArgsConstructor
public class ServiceEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private Double price;
}
