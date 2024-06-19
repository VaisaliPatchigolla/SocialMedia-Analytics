package com.socialMedia.trend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.socialMedia.trend.dto.DataRecordDTO;
import com.socialMedia.trend.service.TrendDetectionService;
import org.springframework.http.ResponseEntity;
import java.time.LocalDate;

@RestController
@RequestMapping("/api/v1") 
public class TrendDetectionController {

    @Autowired
    private TrendDetectionService trendDetectionService;

    @GetMapping("/trends")
    public ResponseEntity<List<DataRecordDTO>> getTrends(
            @RequestParam("startDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
            @RequestParam("endDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate) {
        List<DataRecordDTO> records = trendDetectionService.detectTrends(startDate, endDate);
        return ResponseEntity.ok(records);
    }
}




