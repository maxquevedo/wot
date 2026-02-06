package com.maxquevedo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.maxquevedo.entities.Season;

@Repository
public interface SeasonRepository extends CrudRepository<Season,Long>{
	

}
