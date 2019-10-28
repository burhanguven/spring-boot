package com.book.crudBook.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.crudBook.Service.BookService;
import com.book.crudBook.model.Book;
import com.book.crudBook.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	BookRepository bookRepository;
	
	@Override
	public Book saveBook(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public List<Book> getAllBook() {
		return bookRepository.findAll();
	}

	@Override
	public Book updateBook(Integer id, Book updateBook) {
		
		Book book=bookRepository.findFirstById(id);
		if(book==null)
		{
			return null;
		}
		updateBook.setId(book.getId());
		return bookRepository.save(updateBook);
	}
	public Book deleteBook(Integer id)
	{
		Book book=bookRepository.findFirstById(id);
		bookRepository.delete(book);
		return book;
	}
	
	
}
