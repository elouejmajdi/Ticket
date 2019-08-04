package com.tutorial.app.repostory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorial.app.model.Items;

public interface ItemsRepository extends JpaRepository<Items, Long> {

}
