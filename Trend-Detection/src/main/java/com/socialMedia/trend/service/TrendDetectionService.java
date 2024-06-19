package com.socialMedia.trend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.socialMedia.trend.client.DataIngestionClient;
import com.socialMedia.trend.dto.DataRecordDTO;
import com.socialMedia.trend.repository.TrendRepository;
import feign.FeignException;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

@Service
public class TrendDetectionService {

    @Autowired
    private DataIngestionClient dataIngestionClient;

    @Autowired
    private TrendRepository trendDataRepository;

    public List<DataRecordDTO> detectTrends(LocalDate startDate, LocalDate endDate) {
        try {
            List<DataRecordDTO> records = dataIngestionClient.getRecordsBetweenDates(startDate, endDate);
            return records;
        } catch (FeignException.NotFound e) {
            System.out.println("Data records not found for the specified dates.");
            return Collections.emptyList();
        }
    }
}