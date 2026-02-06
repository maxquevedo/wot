package com.maxquevedo.seeds;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.maxquevedo.entities.Season;
import com.maxquevedo.repositories.SeasonRepository;

@Component
public class SeasonSeed {
	
	@Autowired
	private SeasonRepository repo;
	
	private final String[] DEFAULT_SEASONS = {
			"Spring",
			"Summer",
			"Autumn",
			"Winter"
	};
	
	public SeasonSeed() {
		this.repo = null;
	}

	public SeasonSeed(SeasonRepository repo) {
		this.repo = repo;
	}
	
	public Season createSeason(Season season) {
		return repo.save(season);
	}
	
	public List<Season> createSeasons() {
		List<Season> createdSeasons = new ArrayList<Season>();
		for (String seasonName : DEFAULT_SEASONS) {
			Season season = new Season();
			season.setName(seasonName);
			season.setPosition(1 );
			createdSeasons.add(repo.save(season));
		}
		return createdSeasons;
	}
	

}
