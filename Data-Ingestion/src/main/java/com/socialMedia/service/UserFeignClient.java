package com.socialMedia.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.socialMedia.model.UserDTO;

@FeignClient(name = "User-Profile", url = "http://localhost:8088")
public interface UserFeignClient {
	
    @GetMapping("/api/user/{userId}") 
    public UserDTO getUserById(@PathVariable("userId") Long userId);
}


