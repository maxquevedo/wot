package com.maxquevedo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maxquevedo.entities.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country,Long>{

}
