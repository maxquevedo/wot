package com.maxquevedo.entities;

import java.util.UUID;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="countries")
public class Country {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	
	@NotNull
	@Size(min=3,max=60)
	@Column(unique=true, nullable = false)
	private String name;

	@NotNull
	private Continent continent;
	
	@NotNull
	private Timezone TimeZone;
	
	@NotNull
	private Season season;
	
	
	
	public Country() {
	}



	public Country(UUID id, String name, Continent continent, Timezone timeZone, Season season) {
		super();
		this.id = id;
		this.name = name;
		this.continent = continent;
		TimeZone = timeZone;
		this.season = season;
	}



	public UUID getId() {
		return id;
	}



	public void setId(UUID id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Continent getContinent() {
		return continent;
	}



	public void setContinent(Continent continent) {
		this.continent = continent;
	}



	public Timezone getTimeZone() {
		return TimeZone;
	}



	public void setTimeZone(Timezone timeZone) {
		TimeZone = timeZone;
	}



	public Season getSeason() {
		return season;
	}



	public void setSeason(Season season) {
		this.season = season;
	}
	
	

}
