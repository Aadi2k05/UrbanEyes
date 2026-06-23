package com.urbaneyes.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Issue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(length = 2000)
    private String description;

    private String imageUrl;

    private Double latitude;

    private Double longitude;

    private String issueType;

    private String severity;

    private Integer confidenceScore;

    private Integer priorityScore;

    private Double degradationPercentage;

    private String riskLevel;

    private String status;

    private LocalDateTime createdAt;
}