package com.ahmed.sports.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ahmed.sports.entities.Genre;
@RepositoryRestResource(path = "gn")
@CrossOrigin("http://localhost:4200/") 
public interface GenreRepository extends JpaRepository<Genre , Long> {

}
