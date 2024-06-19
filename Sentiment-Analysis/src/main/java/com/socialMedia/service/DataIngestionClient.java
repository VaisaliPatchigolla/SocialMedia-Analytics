package com.socialMedia.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.socialMedia.dto.DataRecordDTO;

@FeignClient(name = "data-ingestion", url = "http://localhost:8080")
public interface DataIngestionClient {

    @GetMapping("/data-record/{id}")
     public DataRecordDTO getDataRecord(@PathVariable("id") Long id);
}


