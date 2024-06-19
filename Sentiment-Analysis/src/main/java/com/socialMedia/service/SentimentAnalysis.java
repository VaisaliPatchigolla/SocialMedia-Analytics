package com.socialMedia.service;

import org.springframework.stereotype.Service;

@Service
public class SentimentAnalysis {

	public String analyze(String content) {
	    String lowerContent = content.toLowerCase();
	    if (containsPositiveWords(lowerContent) && !containsNegativeWords(lowerContent)) {
	        return "Positive";
	    } else if (containsNegativeWords(lowerContent) && !containsPositiveWords(lowerContent)) {
	        return "Negative";
	    } else if (containsPositiveWords(lowerContent) && containsNegativeWords(lowerContent)) {
	        return "Mixed";
	    } else {
	        return "Neutral";
	    }
	}

	private boolean containsPositiveWords(String content) {
	    return content.contains("love") || content.contains("amazing") || content.contains("fantastic") ||
	            content.contains("great") || content.contains("good") || content.contains("happy") ||
	            content.contains("excellent") || content.contains("awesome") || content.contains("best");
	}

	private boolean containsNegativeWords(String content) {
	    return content.contains("hate") || content.contains("terrible") || content.contains("awful") ||
	            content.contains("bad") || content.contains("worst") || content.contains("sad") ||
	            content.contains("horrible") || content.contains("poor");
	}


}
