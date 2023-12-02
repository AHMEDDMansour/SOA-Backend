package com.ahmed.sports.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ahmed.sports.entities.Sport;
import com.ahmed.sports.service.SportService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class SportRESTController {
	@Autowired
	SportService sportService;
	
	
	@RequestMapping(path = "all" , method = RequestMethod.GET)
	public List<Sport> getAllSports(){
		return sportService.getAllSports();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Sport getSportById(@PathVariable("id") Long id) {
	return sportService.getSport(id);
	 }
	
	
	@RequestMapping(method = RequestMethod.POST)
	public Sport createSport(@RequestBody Sport sport) {
	return sportService.saveSport(sport);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Sport updateSport(@RequestBody Sport sport) {
	return sportService.updateSport(sport);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteSport(@PathVariable("id") Long id)
	{
	sportService.deleteSportById(id);
	}

	@RequestMapping(value="/sptgn/{idG}",method = RequestMethod.GET)
	public List<Sport> getSportsByGId(@PathVariable("idG") Long idG) {
	return sportService.findByGenreIdG(idG);
	}
	

	@RequestMapping(value="/sptsByName/{nom}",method = RequestMethod.GET)
	public List<Sport> findByNomSportContains(@PathVariable("nom") String nom) {
	return sportService.findByNomSportContains(nom);
	}
}
