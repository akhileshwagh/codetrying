package com;

public class Demo {

	public static void main(String[] args) {
		Book book = new Book("akash", "c++");

		System.out.println(book);

		Book book2 = book.ChangeAuthor("akhi");
		System.out.println(book2);

		Book book3 = book.ChangeTitle("java");
		System.out.println(book3);

	}

}
