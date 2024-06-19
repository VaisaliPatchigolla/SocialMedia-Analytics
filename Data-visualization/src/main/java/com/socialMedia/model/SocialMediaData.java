package com.socialMedia.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SocialMediaData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Vizid;
    private String user;
    private String content;
    private Date timestamp;
    
	public SocialMediaData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SocialMediaData(Long vizid, String user, String content, Date timestamp) {
		super();
		this.Vizid = vizid;
		this.user = user;
		this.content = content;
		this.timestamp = timestamp;
	}

	public Long getVizid() {
		return Vizid;
	}

	public void setVizid(Long vizid) {
		Vizid = vizid;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
}
