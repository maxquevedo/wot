package com.maxquevedo.entities;

import java.util.UUID;

import javax.validation.constraints.Size;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="queries")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class WeatherQueries {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	
	@Size(max=100, min = 3)
	private String query;
	
	private Country country;
	
	private City city;
	
//	public WeatherQueries() {
//		// 
//	}

}
