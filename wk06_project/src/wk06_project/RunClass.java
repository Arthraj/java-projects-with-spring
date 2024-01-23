package wk06_project;

public class RunClass {
	public static void main(String [] args) {
		thread_1 x=new thread_1();
		Thread th=new Thread(x);
		th.start();
	}
}
