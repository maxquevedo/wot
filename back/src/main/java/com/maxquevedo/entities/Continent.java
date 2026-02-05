package com.maxquevedo.entities;

import java.io.Serializable;
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
@Table(name="continents")
public class Continent implements Serializable{

	private static final long serialVersionUID = -8971377601362481954L;

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	
	@Size(min=3,max=60)
	@Column(unique = true, nullable = false)
	@NotNull
	private String name;
	
	@NotNull
	private Season currentSeason;
	
	
	public Continent() {
	}


	public Continent(UUID id, String name, Season currentSeason) {
		super();
		this.id = id;
		this.name = name;
		this.currentSeason = currentSeason;
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


	public Season getCurrentSeason() {
		return currentSeason;
	}


	public void setCurrentSeason(Season currentSeason) {
		this.currentSeason = currentSeason;
	}
	
	

}
