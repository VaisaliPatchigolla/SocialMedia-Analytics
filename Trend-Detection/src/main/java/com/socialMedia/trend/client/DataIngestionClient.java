package com.socialMedia.trend.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.socialMedia.trend.dto.DataRecordDTO;

import java.time.LocalDate;
import java.util.List;

@FeignClient(name = "data-ingestion", url = "http://localhost:8080")
public interface DataIngestionClient {

    @GetMapping("/data-records")
    public List<DataRecordDTO> getRecordsBetweenDates(
            @RequestParam("startDate") LocalDate startDate,
            @RequestParam("endDate") LocalDate endDate);
}
