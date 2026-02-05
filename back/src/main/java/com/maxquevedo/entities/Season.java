package com.maxquevedo.entities;

import java.io.Serializable;
import java.util.UUID;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="seasons")
public class Season implements Serializable{
	
	private static final long serialVersionUID = -215141266787758528L;

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	
	@Size(min=6,max=6)
	@NotNull
	@Column(unique=true, nullable = false)
	private String name;
	
	// Position in the year (1-4)
	// 1 - Summer, 2 - Autumn, 3 - Winter, 4 - Spring
	@Max(4)
	@Min(1)
	@NotNull
	@Column(nullable = false)
	private Integer position;
	
	public Season() {
	}
	
	
	public Season(UUID id, String name, Integer position) {
		super();
		this.id = id;
		this.name = name;
		this.position = position;
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

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}
	
}
