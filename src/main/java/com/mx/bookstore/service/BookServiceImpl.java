package com.mx.bookstore.service;

import java.util.List;

import javax.jws.WebService;

import com.mx.bookstore.model.Book;
import com.mx.bookstore.repository.BookRepository;
import com.mx.bookstore.repository.BookRepositoryImpl;

@WebService(endpointInterface = "com.mx.bookstore.service.BookService")
public class BookServiceImpl implements BookService {

	private BookRepository bookRepository = new BookRepositoryImpl();
	
	@Override
	public Book createBook(Book book) {
		return bookRepository.createBook(book);
	}

	@Override
	public List<Book> getAll() {
		return bookRepository.getAll();
	}

}
