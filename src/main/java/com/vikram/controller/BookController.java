package com.vikram.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vikram.model.Book;
import com.vikram.service.IBookService;

@RestController("/book")
public class BookController {
	
	@Autowired
	IBookService bookService;
	
	@GetMapping("/find/{name}")
	public ResponseEntity<List<Book>> getBookByName(@PathVariable("name" )String name){
		List<Book> findByName = bookService.findByName(name);
		return new ResponseEntity<List<Book>>(findByName,HttpStatus.OK);
	}
	
	@PostMapping("/insert")
	public ResponseEntity<Long> saveBookDetails(@RequestBody Book book){
		Long saveBookDetails = bookService.saveBookDetails(book);
		return new ResponseEntity<Long>(saveBookDetails,HttpStatus.OK);
	}

}
