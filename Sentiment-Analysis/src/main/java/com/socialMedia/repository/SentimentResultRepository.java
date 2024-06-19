package com.socialMedia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.socialMedia.model.SentimentResult;

@Repository
public interface SentimentResultRepository extends JpaRepository<SentimentResult, Long> {
}

