package com.tutorial.app.util;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tutorial.app.model.Items;
import com.tutorial.app.model.License;

public class JSONReaderFile {
	
	private final String url ="https://api.github.com/search/repositories?q=org:STMicroelectronics%20topic:stm32cube-mcu-package"; 

	public List<Items> getAllItems() {

		List<Items> db = new ArrayList<Items>();

		ObjectMapper mapper = new ObjectMapper();
		try {
			Items usrPost = mapper.readValue(url, Items.class);
			db.add(usrPost);
			System.out.println(usrPost);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return db;
	}
	
	public Items getItemsById(String id) {
		return null; 
	}
	
	
	public List<License> getLicenseById(String id){
		return null; 
	}

}
