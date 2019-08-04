package com.tutorial.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tutorial.app.repostory.impl.LicenseRepositoryImpl;

@Configuration
public class ConfigClass {

	
	
	@Bean
	public LicenseRepositoryImpl getLicenseRepository() {
		return new LicenseRepositoryImpl();
	}
}
