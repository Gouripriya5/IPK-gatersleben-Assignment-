package com.plantphenotypingexperiments.application.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.plantphenotypingexperiments.application.entity.Accession;

@Repository
public interface AccessionRepository extends CrudRepository<Accession, Integer> {
	Optional<Accession> findByAcceNumb(String acceNumb);

}
