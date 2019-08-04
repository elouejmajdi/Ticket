package com.tutorial.app.repostory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorial.app.model.Owner;

public interface OwnerRepository extends JpaRepository<Owner, Long> {

}
