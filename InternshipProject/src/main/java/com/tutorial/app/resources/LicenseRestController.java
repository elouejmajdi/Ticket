package com.tutorial.app.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.app.model.License;
import com.tutorial.app.repostoriy.LicenseRepository;
import com.tutorial.app.repostoriy.impl.LicenseRepositoryImpl;

@RestController
public class LicenseRestController {

	@Autowired
	private LicenseRepositoryImpl repository;

	@GetMapping("/licenes")
	public List<License> getAllLicenses() {
		return repository.findAll();

	}
	
	@GetMapping("/licenses/{id}")
	public License getOneById(@PathVariable String key) {
		return repository.getOne(key);
	}
	
	@PostMapping("/licenses")
	public void createLicense(@RequestBody License license) {
		repository.save(license); 
	}
	
	@DeleteMapping("/licenses")
	public void deleteLicense(@RequestBody License license) {
		repository.delete(license);
	}
	
	
}
