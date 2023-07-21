package com.vikram.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vikram.model.Book;
import com.vikram.repository.BookRepository;

@Service
public class BookService implements IBookService {
	
	@Autowired
	BookRepository bookRepository;

	@Override
	public List<Book> findByName(String name) {
		return bookRepository.findByName(name);
	}

	@Override
	public Long saveBookDetails(Book book) {
		Book save = bookRepository.save(book);
		return save.getId();
	}

}
