package com.socialMedia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.socialMedia.model.SocialMediaData;
import com.socialMedia.service.SocialMediaDataService;

import java.util.List;

@RestController
@RequestMapping("/api/data")
public class SocialMediaDataController {
    @Autowired
    private SocialMediaDataService service;

    @GetMapping
    public List<SocialMediaData> getAllData() {
        return service.getAllData();
    }
}
