package com.oops;

public class Book {
	int bookId;
	String title;
	String author;
	int price;
	public Book() {
		 bookId= 101;
		 title = "Java Programming";
		 author = "James Gosling";
		 price = 650;
	}
	public void display() {
		System.out.println("Book ID:"+bookId);
		System.out.println("Tile:"+title);
		System.out.println("Author:"+author);
		System.out.println("Price:"+price);
		}

	public static void main(String[] args) {
	Book book1 = new Book();
     book1.display();
	}

}
