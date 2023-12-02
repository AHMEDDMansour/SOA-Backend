package com.ahmed.sports.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomSpt", types = { Sport.class })
public interface SportProjection {
	public String getNomSport();
	
	
	
}
