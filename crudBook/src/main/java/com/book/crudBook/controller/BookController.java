package com.book.crudBook.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book.crudBook.Service.BookService;
import com.book.crudBook.model.Book;
import com.book.crudBook.repository.BookRepository;

@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
	BookService bookService;
	
	@GetMapping()
	public List<Book> getAllBook() {
		return bookService.getAllBook();
	}
	
	@PostMapping()
	public  Book createBook(@Valid @RequestBody Book book)
	{
		return bookService.saveBook(book);
	}
	
	@PutMapping("/{id}")
	public Book updateBook(@PathVariable("id") Integer id, @Valid @RequestBody Book book)
	{
		return bookService.updateBook(id, book);
		
	}
	@DeleteMapping("/{id}")
	public Book deleteBook(@PathVariable("id") Integer id, Book book)
	{
		return bookService.deleteBook(id);		
	}
}
