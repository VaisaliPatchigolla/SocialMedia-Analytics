package com.socialMedia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.socialMedia.dto.DataRecordDTO;
import com.socialMedia.model.SentimentResult;
import com.socialMedia.repository.SentimentResultRepository;
@Service
public class SentimentService {

    @Autowired
    private DataIngestionClient dataIngestionClient;

    @Autowired
    private SentimentAnalysis sentimentAnalysis;

    @Autowired
    private SentimentResultRepository sentimentResultRepository;

    public SentimentResult analyzeSentiment(Long dataRecordId) {
        DataRecordDTO dataRecord = dataIngestionClient.getDataRecord(dataRecordId);
        String content = dataRecord.getContent();
        String sentiment = sentimentAnalysis.analyze(content); // Perform sentiment analysis
        SentimentResult result = new SentimentResult(content, sentiment);
        return sentimentResultRepository.save(result); // Save and return the result
    }
}
