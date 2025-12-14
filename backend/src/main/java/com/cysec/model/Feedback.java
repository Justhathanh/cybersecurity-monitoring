package com.cysec.model;

import jakarta.persistence.*;
import lombok.*;

@Entity @Data @Builder @NoArgsConstructor @AllArgsConstructor
public class Feedback {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne private User user;
    @ManyToOne private Appointment appointment;

    private Integer rating;
    private String comment;
}
