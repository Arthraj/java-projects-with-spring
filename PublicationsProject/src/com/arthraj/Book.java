package com.arthraj;

public class Book extends Publications{

	private int pageCount;

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public Book(String title, float price, int pageCount) {
		super(title, price);
		this.pageCount = pageCount;
		System.out.println("Book added");
		this.display();
	}

	public Book() {
		super("", 0.0f);
		this.pageCount=0;
		this.display();
	} 
	
	public void display() {
		System.out.println("Book Title is "+ this.getTitle());
		System.out.println("Book price is "+ this.getPrice());
		System.out.println("Book pageCount is "+ this.getPageCount());
	}
}
