package com.socialMedia.trend.dto;

import java.time.LocalDateTime;

public class DataRecordDTO {

    private Long recordId;
    private String platform;
    private String username;
    private String content;
    private LocalDateTime timestamp;

    public DataRecordDTO() {
    }

    public DataRecordDTO(Long recordId, String platform, String username, String content, LocalDateTime timestamp) {
        this.recordId = recordId;
        this.platform = platform;
        this.username = username;
        this.content = content;
        this.timestamp = timestamp;
    }

    public Long getRecordId() {
        return recordId;
    }

    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}