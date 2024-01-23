package que4;

public class CustomThread extends Thread{
	public static void main(String [] args) throws InterruptedException {
		CustomThread th1=new CustomThread();
		System.out.println("Id of Thread is= "+ th1.getId());
		System.out.println("Current Status of Thread= "+ th1.isAlive());
		System.out.println("Current Thread is "+ th1.currentThread().getName());
		System.out.println("Sleep Duration of 2 sec");
		Thread.sleep(200);
	}
}
