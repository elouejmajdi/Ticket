package com.tutorial.app;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tutorial.app.model.Items;
import com.tutorial.app.util.JSONReaderFile;

@SpringBootApplication
public class InternshipProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(InternshipProjectApplication.class, args);

		JSONReaderFile obj = new JSONReaderFile();
		List<Items> db = obj.getAllItems(); 
		
		
		for (Items items : db) {
			System.out.println(items+" # ");
		}

	}

}
