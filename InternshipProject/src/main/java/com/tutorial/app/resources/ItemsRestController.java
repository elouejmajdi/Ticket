package com.tutorial.app.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.app.model.Items;
import com.tutorial.app.repostoriy.impl.ItemsRepositoryImpl;
@RestController
public class ItemsRestController {

	
	
	@Autowired
	ItemsRepositoryImpl repository ; 
	
	
	@RequestMapping(value="/items", method= RequestMethod.GET, produces="appliction/json")
	public List<Items> getAll(){
		return repository.findAll(); 
	}
	
	
}
