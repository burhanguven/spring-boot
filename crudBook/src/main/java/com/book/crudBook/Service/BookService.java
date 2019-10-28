package com.book.crudBook.Service;

import java.util.List;

import com.book.crudBook.model.Book;

public interface BookService {

	Book saveBook(Book book);
	List<Book> getAllBook();
	Book updateBook(Integer id, Book book);
	Book deleteBook(Integer id);
}
