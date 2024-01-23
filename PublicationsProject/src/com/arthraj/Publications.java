package com.arthraj;

public class Publications {
	
	private String title;
	private float price;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Publications(String title, float price) {
		super();
		this.title = title;
		this.price = price;
	}
	
}
