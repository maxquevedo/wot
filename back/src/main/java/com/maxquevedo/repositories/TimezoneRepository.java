package com.maxquevedo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maxquevedo.entities.Timezone;

@Repository
public interface TimezoneRepository extends JpaRepository<Timezone, Long>{
	
}
