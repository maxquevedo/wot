package com.maxquevedo.seeds;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.maxquevedo.entities.City;
import com.maxquevedo.repositories.CityRepository;

@Component
public class CitySeed {
	
	@Autowired
	private CityRepository repo;
	private final String DEFAULT_CITY_NAME = "Santiago";

	public CitySeed(CityRepository repo) {
		this.repo = repo;
	}
	
	public CitySeed() {
		this.repo = null;
	}
	
	public City createCity() {
		City newCity = new City();
		newCity.setName(DEFAULT_CITY_NAME);
		newCity.setCountry_id(1L);
		return repo.save(newCity);
	}
	
	public City createCity(City city) {
		return repo.save(city);
	}

}
