package com.arthraj;

public class Tape extends Publications{
	private float mins;

	public float getMins() {
		return mins;
	}

	public void setMins(float mins) {
		this.mins = mins;
	}

	public Tape(String title, float price, float mins) {
		super(title, price);
		this.mins = mins;
		System.out.println("New Tape Added");
		this.display();
	}
	
	public Tape() {
		super("",0.0f);
		this.mins=0.0f;
		this.display();
	}
	public void display() {
		System.out.println("Tape Title is "+ this.getTitle());
		System.out.println("Tape price is "+ this.getPrice());
		System.out.println("Tape mins is "+ this.getMins());
	}
}
