package com.plantphenotypingexperiments.application.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.plantphenotypingexperiments.application.entity.Trait;

@Repository
public interface TraitRepository extends CrudRepository<Trait, Integer>{
	Optional<Trait> findByTraitNumb(String traitNumb);
}
