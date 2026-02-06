package com.maxquevedo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maxquevedo.entities.Continent;

@Repository
public interface ContinentRepository extends JpaRepository<Continent, Long>{

}
