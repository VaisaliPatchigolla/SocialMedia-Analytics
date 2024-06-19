package com.socialMedia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SentimentAnalysisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SentimentAnalysisApplication.class, args);
	}

}
