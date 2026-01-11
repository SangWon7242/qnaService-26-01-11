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

  // 하나의 질문의 답변이 여러개 달릴 수 있다.
  @ManyToOne // 좌측은 많고 우측은 하나다.
  private Question question;
}