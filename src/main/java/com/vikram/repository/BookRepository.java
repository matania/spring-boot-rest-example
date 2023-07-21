package com.vikram.repository;

import org.springframework.data.repository.CrudRepository;

import com.vikram.model.Book;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {

	List<Book> findByName(String name);

}
