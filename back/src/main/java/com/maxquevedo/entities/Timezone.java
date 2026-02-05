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
@Table(name="timezones")
public class Timezone implements Serializable{
	
	private static final long serialVersionUID = 7783067040780575719L;

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	
	//ej +8
	@Size(min=2, max=3)
	@NotNull
	@Column(nullable = false)
	private String value;
	
	public Timezone() {
	}

	
	public Timezone(UUID id, String value) {
		super();
		this.id = id;
		this.value = value;
	}


	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	

}
