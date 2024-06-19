package com.socialMedia.trend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TrendDetectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrendDetectionApplication.class, args);
	}

}
