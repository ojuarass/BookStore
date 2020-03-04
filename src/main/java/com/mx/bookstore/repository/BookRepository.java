package com.mx.bookstore.repository;

import java.util.List;

import com.mx.bookstore.model.Book;

public interface BookRepository {

	/**
	 * Metodo para crear un libro
	 * @param book
	 * @return libro creado
	 */
	Book createBook(Book book);
	
	/**
	 * Metodo para obtener todos los libros
	 * @return
	 */
	List<Book> getAll();
}
