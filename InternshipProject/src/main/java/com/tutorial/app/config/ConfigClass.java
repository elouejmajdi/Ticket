package com.tutorial.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tutorial.app.repostoriy.LicenseRepository;
import com.tutorial.app.repostoriy.impl.ItemsRepositoryImpl;
import com.tutorial.app.repostoriy.impl.LicenseRepositoryImpl;
import com.tutorial.app.util.JSONReaderFile;

@Configuration
public class ConfigClass {

//	@Bean
//	public LicenseRepositoryImpl getLicenseRepository() {
//		return new LicenseRepositoryImpl();
//	}

	@Bean
	public ItemsRepositoryImpl getItemsRepository() {
		return new ItemsRepositoryImpl();
	}
	
	@Bean
	public JSONReaderFile jsonReaderFile() {
		return new JSONReaderFile();
	}
}
