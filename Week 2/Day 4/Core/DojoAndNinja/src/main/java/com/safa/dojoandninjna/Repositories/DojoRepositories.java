package com.safa.dojoandninjna.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.safa.dojoandninjna.Models.Dojolmodel;

@Repository
public interface DojoRepositories extends CrudRepository<Dojolmodel, Long>{
	 // this method retrieves all the books from the database
    List<Dojolmodel> findAll();
}