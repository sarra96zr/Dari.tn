package tn.dari.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.dari.entities.Annonce;


@Repository
public interface AnnonceRepository extends CrudRepository<Annonce, Long> {



}
