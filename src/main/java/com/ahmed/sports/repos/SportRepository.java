package com.ahmed.sports.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ahmed.sports.entities.Genre;
import com.ahmed.sports.entities.Sport;

@RepositoryRestResource(path = "rest")
public interface SportRepository extends JpaRepository<Sport, Long> {
	
	List<Sport> findByNomSport(String nom);
	List<Sport> findByNomSportContains(String nom);
	
	@Query("select s from Sport s where s.nomSport like %?1 and s.sexe = ?2")
	List<Sport> findByNomSexe (String nom, String sexe);
	
	
	@Query("select s from Sport s where s.genre = ?1")
	List<Sport> findByGenre (Genre genre);
	
	
	List<Sport> findByGenreIdG (Long id);
	
	List<Sport> findByOrderByNomSportAsc();
	
	@Query("select s from Sport s order by s.nomSport ASC, s.sexe DESC")
	List<Sport> trierSportsNomsSexe ();
	
}
