package com.safa.bookclub.Repositorie;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.safa.bookclub.Modells.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

	// Find ALL BOOKS
	List<Book> findAll();
}