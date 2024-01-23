package com.arthraj;

import java.util.Scanner;

public class BookStore {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter choice");
		
		System.out.println("1. Add Book");
		System.out.println("2. Add Tape");
		
		int c=sc.nextInt();
		String faltu=sc.nextLine();
		switch(c) {
		case 1: {
			try {
			
			System.out.println("Enter title of Book");
			String title=sc.nextLine();
			
			System.out.println("Enter price of Book");
			float price=sc.nextFloat();
			
			System.out.println("Enter pageCount of Book");
			int pc=sc.nextInt();
			
			Book B=new Book(title,price,pc);
			}
			catch(Exception e){
				System.out.println("Exception Occured");
				Book B=new Book();
			}
			break;
		}
		
		case 2: {
			try {
			System.out.print("Enter title of Tape");
			String title=sc.nextLine();
			
			System.out.println("Enter price of Tape");
			float price=sc.nextFloat();
			
			System.out.println("Enter duration of Tape");
			float dc=sc.nextInt();
			
			Tape T=new Tape(title,price,dc);
			}
			
			catch(Exception e) {
				System.out.println("Exception Occured:"+ e.getMessage());
				Tape T=new Tape();
			}
			break;
			
		}
		}
		
	}
}
