package com.rodoassessment.gdprassessmentpanel.repository;

import com.rodoassessment.gdprassessmentpanel.model.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChapterRepository extends JpaRepository<Chapter, Long> {
    
    List<Chapter> findAllByOrderByOrderNumberAsc();
}
