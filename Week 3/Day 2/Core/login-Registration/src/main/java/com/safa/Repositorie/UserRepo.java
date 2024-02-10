package com.safa.Repositorie;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.safa.Model.User;



@Repository
public interface UserRepo extends CrudRepository<User, Long> {
	//find logging user
	Optional<User> findByEmail(String email);
}