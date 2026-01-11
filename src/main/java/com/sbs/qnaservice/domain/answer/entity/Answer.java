package com.sbs.qnaservice.domain.answer.entity;

import com.sbs.qnaservice.domain.question.entity.Question;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Builder
public class Answer {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(columnDefinition = "TEXT")
  private String content;

  private LocalDateTime createDate;

//  @ManyToOne
//  private Question question;
}