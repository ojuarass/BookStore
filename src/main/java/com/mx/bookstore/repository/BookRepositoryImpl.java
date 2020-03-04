package com.mx.bookstore.repository;

import java.util.ArrayList;
import java.util.List;

import com.mx.bookstore.model.Book;

public class BookRepositoryImpl implements BookRepository {

	private static List<Book> books = new ArrayList<>();

	@Override
	public Book createBook(Book book) {
		System.out.println("Book created:::");
		books.add(book);
		return book;
	}

	@Override
	public List<Book> getAll() {
		return books;
	}

}
