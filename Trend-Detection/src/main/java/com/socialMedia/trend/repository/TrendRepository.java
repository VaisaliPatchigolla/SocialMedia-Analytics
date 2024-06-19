package com.socialMedia.trend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.socialMedia.trend.model.TrendData;

public interface TrendRepository extends JpaRepository<TrendData, Long> {

}

