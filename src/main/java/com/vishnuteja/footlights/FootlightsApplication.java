package com.vishnuteja.footlights;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class FootlightsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FootlightsApplication.class, args);
	}

}
