package com.maxquevedo.entities;

import java.util.UUID;

import javax.validation.constraints.NotNull;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name="cities")
public class City {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@NotNull
	private UUID id;
	@NotNull
	private String name;
	@NotNull
	@PrimaryKeyJoinColumn(name="id_country", referencedColumnName = "id")
	private String id_country;
	
	public City() {
	}
	
	public City(@NotNull String name, @NotNull String id_country) {
		this.name = name;
		this.id_country = id_country;
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

	public String getId_country() {
		return id_country;
	}

	public void setId_country(String id_country) {
		this.id_country = id_country;
	}
	
	

}
