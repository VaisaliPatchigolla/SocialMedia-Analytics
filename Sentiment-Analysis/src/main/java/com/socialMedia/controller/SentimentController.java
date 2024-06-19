package com.socialMedia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.socialMedia.model.SentimentResult;
import com.socialMedia.service.SentimentService;

@RestController
@RequestMapping("/api/v1")
public class SentimentController {

    @Autowired
    private SentimentService sentimentService;

    @GetMapping("/analyze/{dataRecordId}")
    public ResponseEntity<SentimentResult> analyzeSentiment(@PathVariable Long dataRecordId) {
        SentimentResult result = sentimentService.analyzeSentiment(dataRecordId);
        return ResponseEntity.ok(result);
    }
}
