package com.safa.dojoandninjna.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.safa.dojoandninjna.Models.Ninjamodel;

@Repository
public interface Ninjarepositorie extends CrudRepository<Ninjamodel,Long> {
	List<Ninjamodel> findAll();
}