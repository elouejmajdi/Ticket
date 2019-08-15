package com.tutorial.app.repostoriy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutorial.app.model.License;
public interface LicenseRepository extends JpaRepository<License, String> {

}
