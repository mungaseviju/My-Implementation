//Create a class Book which describes its Book_title and Book_price. Use getter
and setter methods to get & set the Books description. Implement createBook
and showBook methods to create and display Book Information. Write a separate class
BookInfo to access the Book class

import java.util.*;
import java.util.Scanner;
class BookInfo{
	int price;
	String name;
	public int getPrice() {
		System.out.println("Price = "+price);
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		System.out.println("Name = "+name);

		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
class Book {
public static void main(String arg[])
{
	Scanner s = new Scanner(System.in);
	String book_title;
	int book_price;
	System.out.print("Enter Book Title:");
	book_title = s.next();
	System.out.print("Enter Book price:");
	book_price = s.nextInt();
	BookInfo b=new BookInfo();
	b.setName(book_title);
	b.setPrice(book_price);
	b.getName();
	b.getPrice();
}
}