package com.maxquevedo.seeds;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SeedInitializer implements CommandLineRunner{
	
	@Autowired
	private TimezoneSeed timezone;
	@Autowired
	private SeasonSeed season;
	@Autowired
	private ContinentSeed continent;
	@Autowired
	private CountrySeed country;
	@Autowired
	private CitySeed city;
	

	public SeedInitializer() {
		super();
		
	}

	public SeedInitializer(TimezoneSeed timezone, SeasonSeed season, ContinentSeed continent, CountrySeed country,
			CitySeed city) {
		super();
		this.timezone = timezone;
		this.season = season;
		this.continent = continent;
		this.country = country;
		this.city = city;
	}



	@Override
	public void run(String... args) throws Exception {
		if(timezone != null){
			timezone.createTimezone("-4");
			timezone.createTimezone("America/Santiago");
		}
		if(season != null)
			season.createSeasons();
		if(continent != null)
			continent.createContinents();
		if(country != null)
			country.createCountry();
		if(city != null)
			city.createCity();
		
	}

}
