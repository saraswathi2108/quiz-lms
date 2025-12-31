package com.examination.quiz.repository;

import com.examination.quiz.entity.Option;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface OptionRepository extends JpaRepository<Option, Long> {
    List<Option> findByQuestionId(Long id);
}
