package tn.dari.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.junit.Test;
import tn.dari.entities.Annonce;
import tn.dari.entities.Type_Annonce;
import tn.dari.repository.AnnonceRepository;
import tn.dari.service.AnnonceServiceImpl;


@SpringBootApplication()
@EntityScan("tn.dari.entities")
public class Application {
	
	
	public static void main(String[] args) {
		
		SpringApplication.run(Application.class, args);	
	
	
	}

}
