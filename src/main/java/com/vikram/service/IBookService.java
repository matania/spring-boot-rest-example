package com.vikram.service;

import java.util.List;

import com.vikram.model.Book;

public interface IBookService {
	List<Book> findByName(String name);
	Long saveBookDetails(Book book);

}
