package com.plantphenotypingexperiments.application.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.plantphenotypingexperiments.application.entity.Experiment;

@Repository
public interface ExperimentRepository extends CrudRepository<Experiment, Integer>{
	Optional<Experiment> findByExpNumb(String numb);

}
