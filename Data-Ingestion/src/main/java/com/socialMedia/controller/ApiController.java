package com.socialMedia.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.socialMedia.model.DataRecord;
import com.socialMedia.service.DataIngestionService;

@RestController
public class ApiController {

    @Autowired
    private DataIngestionService dataIngestionService;

    @PostMapping("/api/data/ingest")
    public ResponseEntity<String> ingestData(@RequestBody DataRecord dataRecord) {
        try {
            dataIngestionService.ingestData(dataRecord);
            return ResponseEntity.ok("Data ingested successfully");
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred: " + e.getMessage());
        }
    }

    @GetMapping("/data-record/{id}")
    public ResponseEntity<DataRecord> getDataRecord(@PathVariable("id") Long id) {
        try {
            DataRecord dataRecord = dataIngestionService.getDataRecord(id);
            return ResponseEntity.ok(dataRecord);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }
    
    @GetMapping("/data-records")
    public List<DataRecord> getRecordsBetweenDates(
            @RequestParam("startDate") LocalDate startDate,
            @RequestParam("endDate") LocalDate endDate) {
        return dataIngestionService.getRecordsBetweenDates(startDate, endDate);
    }
}
