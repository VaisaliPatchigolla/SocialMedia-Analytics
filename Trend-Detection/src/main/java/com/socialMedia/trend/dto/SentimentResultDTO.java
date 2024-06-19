package com.socialMedia.trend.dto;

public class SentimentResultDTO {

    private Long sentimentId;
    private String text;
    private String sentiment;

    public SentimentResultDTO() {
    }

    public SentimentResultDTO(Long sentimentId, String text, String sentiment) {
        this.sentimentId = sentimentId;
        this.text = text;
        this.sentiment = sentiment;
    }

    public Long getSentimentId() {
        return sentimentId;
    }

    public void setSentimentId(Long sentimentId) {
        this.sentimentId = sentimentId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSentiment() {
        return sentiment;
    }

    public void setSentiment(String sentiment) {
        this.sentiment = sentiment;
    }
}
