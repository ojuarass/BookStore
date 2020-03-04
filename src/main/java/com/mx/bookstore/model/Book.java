package com.mx.bookstore.model;

public class Book {
	private String name;
	private String author;
	private String editorial;
	private String isbn;
	private BookTypeEnum type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public BookTypeEnum getType() {
		return type;
	}

	public void setType(BookTypeEnum type) {
		this.type = type;
	}

}
