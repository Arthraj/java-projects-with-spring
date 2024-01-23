package que2;

import java.util.Scanner;

public class OddEvenPrint {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Runnable o1=new Even(n);
		Runnable o2=new Odd(n);
		Thread t1=new Thread(o1);
		Thread t2=new Thread(o2);
		t2.start();
		try {
			Thread.sleep(50);
		}
		catch(Exception e) {
		}
		t1.start();
	}
}
