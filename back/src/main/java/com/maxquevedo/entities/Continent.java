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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Size(min=3,max=60)
	@Column(unique = true, nullable = false)
	@NotNull
	private String name;
	
	@NotNull
	private Long currentSeason_id;
	
	
	public Continent() {
	}


	public Continent(Long id, String name, Long currentSeason) {
		super();
		this.id = id;
		this.name = name;
		this.currentSeason_id = currentSeason;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Long getCurrentSeason() {
		return currentSeason_id;
	}


	public void setCurrentSeason(Long currentSeason) {
		this.currentSeason_id = currentSeason;
	}
	
	

}
