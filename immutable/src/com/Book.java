package com;

public final class Book {

	private final String author;
	private final String title;

	public Book(String author, String title) {

		this.author = author;
		this.title = title;
	}

	@Override
	public String toString() {
		return "Book [author=" + author + ", title=" + title + ",hashccode = "+hashCode()+"]";
	}

	public String getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}

	// modified author
	public Book ChangeAuthor(String author) {
		return new Book(author, this.title);
	}

	// modified title
	public Book ChangeTitle(String title) {
		return new Book(title, this.author);
	}

}
