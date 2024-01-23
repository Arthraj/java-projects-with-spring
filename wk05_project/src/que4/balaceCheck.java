package que4;

import java.util.Scanner;

public class balaceCheck {
	public static void main(String [] args) {
		System.out.println("Enter String");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		int rightFaced=0;
		int leftFaced=0;
		
		int n=str.length();
		
		for(int i=0;i<n;i++) {
			char ch=str.charAt(i);
			if(ch=='{' || ch=='(' || ch=='[')rightFaced++;
			else if(ch=='}' || ch==')' || ch==']')leftFaced++;
		}
		
		if(leftFaced==rightFaced) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}
}
