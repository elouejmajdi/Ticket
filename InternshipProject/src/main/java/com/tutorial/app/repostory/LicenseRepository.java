package com.tutorial.app.repostory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorial.app.model.License;

public interface LicenseRepository extends JpaRepository<License, String> {

}
