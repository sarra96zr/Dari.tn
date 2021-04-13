package tn.dari.spring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import tn.dari.entities.Annonce;
import tn.dari.entities.Type_Annonce;
import tn.dari.service.AnnonceServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {
	@Autowired
	static AnnonceServiceImpl an;
	@Test
	
	public void contextLoads() {
	
		//Annonce a = new Annonce("Maison" , "bardo", "none", "belle maison 300m²", "oui", 300, Type_Annonce.MAISON);
		//an.addAnnonce(a);
		//an.deleteAnnonce("1");
		an.retrieveAllAnnonces();
		
	}
	
}
