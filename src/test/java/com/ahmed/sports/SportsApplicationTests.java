package com.ahmed.sports;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ahmed.sports.entities.Genre;
import com.ahmed.sports.entities.Sport;
import com.ahmed.sports.repos.SportRepository;

@SpringBootTest
class SportsApplicationTests {

	@Autowired
	private SportRepository sportRepository;

	@Test
	public void testCreateSport() {
		Sport spt = new Sport("Box", "Homme", new Date());
		sportRepository.save(spt);
	}

	@Test
	public void testFindSport() {
		Sport s = sportRepository.findById(1L).get();
		System.out.println(s);
	}

	@Test
	public void testUpdateProduit() {
		Sport s = sportRepository.findById(1L).get();
		s.setNomSport("Football");
		sportRepository.save(s);
	}

	@Test
	public void testDeleteSport() {
		sportRepository.deleteById(1L);

	}

	@Test
	public void testFindAllSports() {
		List<Sport> spt = sportRepository.findAll();
		for (Sport s : spt) {
			System.out.println(s);
		}
	}

	@Test
	public void testFindSportByNom() {
		List<Sport> spt = sportRepository.findByNomSport("Tennis");
		for (Sport s : spt) {
			System.out.println(s);
		}
	}
	
	@Test
	public void testFindSportByNomContains() {
		List<Sport> spt = sportRepository.findByNomSportContains("T");
		for (Sport s : spt) {
			System.out.println(s);
		}
	}
	
	@Test
	public void testfindByNomSexe() {
		List<Sport> spt = sportRepository.findByNomSexe("Tennis", "Femme");
		for (Sport s : spt) {
			System.out.println(s);
		}
	}
	
	
	@Test
	public void testfindByGenre() {
		Genre gne = new Genre();
		gne.setIdG(1L);
		List<Sport> spt = sportRepository.findByGenre(gne);
		for (Sport s : spt) {
			System.out.println(s);
		}
	}
	
	
	
	@Test
	public void testfindByGenreIdG()
	{
	List<Sport> spt = sportRepository.findByGenreIdG(1L);
	for (Sport s : spt)
	{
	System.out.println(s);
	}
	 }
	
	
	@Test
	public void testfindByOrderByNomSportAsc() {
		List<Sport> spt = sportRepository.findByOrderByNomSportAsc();
		for (Sport s : spt) {
			System.out.println(s);
		}
	}
	
	
	@Test
	public void testTrierSportsNomsSexe()
	{
	List<Sport> spt = sportRepository.trierSportsNomsSexe();
	for (Sport s : spt)
	{
	System.out.println(s);
	}
	}

	
	
}
