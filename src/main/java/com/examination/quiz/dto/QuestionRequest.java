package com.examination.quiz.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuestionRequest {

    private Long questionId;

    private String questionText;
    private String questionType;
    private Integer marks;
    private List<String> options;
    private List<Integer> correctOptionIndexes;
}