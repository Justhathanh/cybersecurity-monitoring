package com.cysec.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity @Data @Builder @NoArgsConstructor @AllArgsConstructor
public class ActivityLog {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String action;
    private String ip;
    private LocalDateTime timestamp;
}
