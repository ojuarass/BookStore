package com.mx.bookstore.service;

import java.util.List;

import javax.jws.WebService;

import com.mx.bookstore.model.Book;

@WebService
public interface BookService {

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
