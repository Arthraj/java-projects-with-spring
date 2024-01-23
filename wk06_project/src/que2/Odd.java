package que2;

public class Odd implements Runnable{
	private int m;
	public Odd(int a) {
		m=a;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=m;i++) {
			if(i%2!=0) {
				System.out.println("Odd Number:"+i);
				try {
					Thread.sleep(100);
				}
				catch(Exception e) {
					
				}
			}
			
		}
	}
	
}
