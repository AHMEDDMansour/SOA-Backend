package com.ahmed.sports.service;

import java.util.List;

import com.ahmed.sports.entities.Genre;
import com.ahmed.sports.entities.Sport;

public interface SportService {
	Sport saveSport(Sport s);

	Sport updateSport(Sport s);

	void deleteSport(Sport s);

	void deleteSportById(Long id);

	Sport getSport(Long id);

	List<Sport> getAllSports();
	List<Sport> findByNomSport(String nom);
	List<Sport> findByNomSportContains(String nom);
	List<Sport> findByNomSexe (String nom, String sexe);
	List<Sport> findByGenre(Genre genre);
	List<Sport> findByGenreIdG(Long id);
	List<Sport> findByOrderByNomSportAsc();
	List<Sport> trierSportsNomsSexe();
}
