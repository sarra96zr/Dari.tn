package tn.dari.service;

import java.util.List;
import java.util.Optional;

import tn.esprit.Entity.Annonce;

public interface AnnonceService {



	List<Annonce> retrieveAllAnnonces();
	Annonce addAnnonce(Annonce a);
	void deleteAnnonce(String id);
	Annonce updateAnnonce(Annonce a);
	Optional<Annonce> retrieveAnnonce(String id);


}
