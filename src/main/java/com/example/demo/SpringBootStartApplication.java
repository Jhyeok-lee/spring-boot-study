package com.example.demo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.domain.Journal;
import com.example.demo.repository.JournalRepository;

@SpringBootApplication
public class SpringBootStartApplication {
	
	@Bean
	InitializingBean saveData(JournalRepository repo) {
		return () -> {
			repo.save(new Journal("Sprint Boot Intro", "I learn spring-boot today", "01/01/2016"));
			repo.save(new Journal("Simple spring boot project",
					"I make a first spring boot project", "01/02/2016"));
			repo.save(new Journal("Sprint Boot ", "I good", "01/03/2016"));
			repo.save(new Journal("Sprint Boot Cloud", "I learn spring-boot using"
					+ " cloud foundary", "01/04/2016"));
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStartApplication.class, args);
	}
}
