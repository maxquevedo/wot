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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name="countries")
public class Country implements Serializable {
	private static final long serialVersionUID = 821132025083950064L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min=3,max=60)
	@Column(unique=true, nullable = false)
	private String name;

	@NotNull
	private Long continent_id;
	
	@NotNull
	private Long timeZone_id;
	
	@NotNull
	private String code;
	
	@NotNull
	private Long season_id;

	public Country(Long id, String name, Long continent_id, Long timeZone_id, String code, Long season_id) {
		super();
		this.id = id;
		this.name = name;
		this.continent_id = continent_id;
		this.timeZone_id = timeZone_id;
		this.code = code;
		this.season_id = season_id;
	}

	public Country() {
		super();
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

	public Long getContinent_id() {
		return continent_id;
	}

	public void setContinent_id(Long continent_id) {
		this.continent_id = continent_id;
	}

	public Long getTimeZone_id() {
		return timeZone_id;
	}

	public void setTimeZone_id(Long timeZone_id) {
		this.timeZone_id = timeZone_id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Long getSeason_id() {
		return season_id;
	}

	public void setSeason_id(Long season_id) {
		this.season_id = season_id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
	
	
	