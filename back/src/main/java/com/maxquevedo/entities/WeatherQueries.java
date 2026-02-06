package com.maxquevedo.entities;

import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Size(max=100, min = 3)
	@NotNull
	private String query;
	
	@NotNull
	@JoinColumn(name="country_id", referencedColumnName = "id")
	private Long country_id;
	
	@NotNull
	@JoinColumn(name="city_id", referencedColumnName = "id")
	private Long city_id;

	@NotNull
	@Column(name="gps_data")
	private String gpsData;

	@Column(name="response_data")
	private String responseData;

	@CreationTimestamp
	@Column(name="created_at", updatable = false)
	private LocalDateTime createdAt;
	
	@UpdateTimestamp
	@Column(name="updated_at")
	private LocalDateTime updatedAt;
	
//	public WeatherQueries() {
//		// 
//	}

}
