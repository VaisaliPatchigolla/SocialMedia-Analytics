package com.socialMedia.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.socialMedia.model.DataRecord;

public interface DataRecordRepository extends JpaRepository<DataRecord, Long> {
	List<DataRecord> findByTimestampBetween(LocalDateTime startDate, LocalDateTime endDate);
}
