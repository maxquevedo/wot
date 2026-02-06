package com.maxquevedo.seeds;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.maxquevedo.entities.Timezone;
import com.maxquevedo.repositories.TimezoneRepository;

@Component
public class TimezoneSeed {
	
	@Autowired
	private TimezoneRepository repo;
	
	public TimezoneSeed() {
		this.repo = null;
	}
	
	public TimezoneSeed(TimezoneRepository repo) {
		this.repo = repo;
	}
	
	public Timezone saveTimezone(Timezone timezone) {
		return repo.save(timezone);
	}
	
	public Timezone createTimezone(String value) {
		Timezone timezone = new Timezone();
		timezone.setValue(value);
		return repo.save(timezone);
	}
	
	public Timezone createTimezone() {
		Timezone timezone = new Timezone();
		timezone.setValue("-4");
		return repo.save(timezone);
	}

}
