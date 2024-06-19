package com.socialMedia.trend.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.socialMedia.trend.dto.SentimentResultDTO;

@FeignClient(name = "sentiment-analysis", url = "http://localhost:8082")
public interface SentimentAnalysisClient {

	@GetMapping("api/v1/analyze/{dataRecordId}")
    public ResponseEntity<SentimentResultDTO> analyzeSentiment(@RequestParam Long dataRecordId);
}
