package com.socialMedia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.socialMedia.model.SocialMediaData;
import com.socialMedia.repository.SocialMediaDataRepository;

import java.util.List;

@Service
public class SocialMediaDataService {
    @Autowired
    private SocialMediaDataRepository repository;

    public List<SocialMediaData> getAllData() {
        return repository.findAll();
    }
}
