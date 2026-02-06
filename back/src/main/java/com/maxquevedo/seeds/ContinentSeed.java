package com.maxquevedo.seeds;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.maxquevedo.entities.Continent;
import com.maxquevedo.repositories.ContinentRepository;

@Component
public class ContinentSeed {
	@Autowired
	private ContinentRepository repo;
	
	private final String[] continents = {
			"Africa",
			"Antarctica",
			"Asia",		
			"Europe",
			"North America",
			"Oceania",
			"South America"
	};
	
	public ContinentSeed(ContinentRepository repo) {
		this.repo = repo;
		
	}
	
	public List<Continent> createContinents(){
		List<Continent> createdContinents = new ArrayList<Continent>();
		for(String continent : continents) {
			Continent newContinent = new Continent();
			newContinent.setName(continent);
			newContinent.setCurrentSeason(1L);
			createdContinents.add(repo.save(newContinent));
		}
		return createdContinents;
	}

}
