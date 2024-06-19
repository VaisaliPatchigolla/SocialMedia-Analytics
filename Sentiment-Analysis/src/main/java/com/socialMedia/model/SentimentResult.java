package com.socialMedia.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SentimentResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Sentimentid;
    private String text;
    private String sentiment;

    public SentimentResult() {
    }

    public SentimentResult(String text, String sentiment) {
        this.text = text;
        this.sentiment = sentiment;
    }
    
    public Long getSentimentid() {
		return Sentimentid;
	}

	public void setSentimentid(Long sentimentid) {
		Sentimentid = sentimentid;
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
