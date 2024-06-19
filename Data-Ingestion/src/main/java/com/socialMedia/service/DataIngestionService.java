package com.socialMedia.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.socialMedia.model.DataRecord;
import com.socialMedia.model.UserDTO;
import com.socialMedia.repository.DataRecordRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DataIngestionService {

    @Autowired
    private UserFeignClient userFeignClient;

    @Autowired
    private DataRecordRepository dataRecordRepository;

    public void ingestData(DataRecord dataRecord) {
        UserDTO user = userFeignClient.getUserById(dataRecord.getUserid());
        if (user != null) {
            dataRecord.setTimestamp(LocalDateTime.now());
            dataRecordRepository.save(dataRecord);
        } else {
            throw new IllegalArgumentException("User not found for userId: " + dataRecord.getUserid());
        }
    }

    public DataRecord getDataRecord(Long id) {
        return dataRecordRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("DataRecord not found for id: " + id));
    }
    
    public List<DataRecord> getRecordsBetweenDates(LocalDate startDate, LocalDate endDate) {
        LocalDateTime startDateTime = startDate.atStartOfDay();
        LocalDateTime endDateTime = endDate.atTime(LocalTime.MAX);
        return dataRecordRepository.findByTimestampBetween(startDateTime, endDateTime);
    }
}

