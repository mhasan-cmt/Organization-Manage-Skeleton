package com.arpitasati;

import com.arpitasati.config.InitDatabaseService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class OrganizationManageApplication implements CommandLineRunner {
	@Resource
	InitDatabaseService initDatabaseService;

	public static void main(String[] args) {
		SpringApplication.run(OrganizationManageApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		initDatabaseService.init();
	}
}
