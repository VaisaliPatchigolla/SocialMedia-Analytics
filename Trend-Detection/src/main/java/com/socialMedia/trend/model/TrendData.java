package com.socialMedia.trend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TrendData {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long trendId;

    @Column(name = "`change`")
    private String change; 

    @Column(name = "mentions")
    private Integer mentions;

    private String sentiment;
    private String topic;
    
	public TrendData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public TrendData(Long trendId, String topic, int mentions, String change, String sentiment) {
		super();
		this.trendId = trendId;
		this.topic = topic;
		this.mentions = mentions;
		this.change = change;
		this.sentiment = sentiment;
	}
	
	public Long getTrendid() {
		return trendId;
	}
	public void setTrendid(Long trendid) {
		trendId = trendid;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public int getMentions() {
		return mentions;
	}
	public void setMentions(int mentions) {
		this.mentions = mentions;
	}
	public String getChange() {
		return change;
	}
	public void setChange(String change) {
		this.change = change;
	}
	public String getSentiment() {
		return sentiment;
	}
	public void setSentiment(String sentiment) {
		this.sentiment = sentiment;
	}

    
}
