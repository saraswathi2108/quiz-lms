package com.examination.quiz.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuizCreateResponse {

    private Long quizId;
    private String quizType;
    private Long courseId;
    private Long lectureId;
    private Integer totalQuestions;
    private String message;

    private List<QuestionRequest> questions;
}