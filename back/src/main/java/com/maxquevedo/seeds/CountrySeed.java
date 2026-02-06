package com.maxquevedo.seeds;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.maxquevedo.entities.Country;
import com.maxquevedo.repositories.CountryRepository;

@Component
public class CountrySeed {
	
	@Autowired
	private CountryRepository repo;
	private final String DEFAULT_COUNTRY_CODE = "CL";
	private final String DEFAULT_COUNTRY_NAME = "Chile";
	
	public CountrySeed() {
		this.repo = null;
	}

	public CountrySeed(CountryRepository repo) {
		this.repo = repo;
	}
	
	public Country createCountry() {
		Country newCountry = new Country();
		newCountry.setName(DEFAULT_COUNTRY_NAME);
		newCountry.setCode(DEFAULT_COUNTRY_CODE);
		newCountry.setSeason_id(1L);
		newCountry.setContinent_id(7L);
		newCountry.setTimeZone_id(1L);
		
		return repo.save(newCountry);
	}

}
