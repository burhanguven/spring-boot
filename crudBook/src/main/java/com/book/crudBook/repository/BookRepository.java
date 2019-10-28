package com.book.crudBook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book.crudBook.model.Book;

public interface BookRepository  extends JpaRepository<Book, Integer>{

	Book findFirstById(Integer id);
}
