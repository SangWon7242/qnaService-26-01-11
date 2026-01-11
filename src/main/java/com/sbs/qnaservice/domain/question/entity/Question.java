package com.sbs.qnaservice.domain.question.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Builder
public class Question {
  @Id // primary key
  @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT
  private Integer id;

  @Column(length = 200) // VARCHAR(200)
  private String subject;

  @Column(columnDefinition = "TEXT") // TEXT
  private String content;

  private LocalDateTime createDate; // DATETIME
}