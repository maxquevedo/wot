package com.maxquevedo.entities;

import java.io.Serializable;
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
public class City implements Serializable{
	
	private static final long serialVersionUID = 1044974158474324157L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private Long id;
	@NotNull
	private String name;
	@NotNull
	@PrimaryKeyJoinColumn(name="country_id", referencedColumnName = "id")
	private Long country_id;
	
	public City() {
		super();
	}
	
	public City(Long id, String name, Long country_id) {
		super();
		this.id = id;
		this.name = name;
		this.country_id = country_id;
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
	public Long getCountry_id() {
		return country_id;
	}
	public void setCountry_id(Long country_id) {
		this.country_id = country_id;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	

}
