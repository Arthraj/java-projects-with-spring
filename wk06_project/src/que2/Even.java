package que2;

public class Even implements Runnable{
	private int m;
	public Even(int a) {
		m=a;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=m;i++) {
			if(i%2==0) {
				System.out.println("Even Number:"+i);
				try {
					Thread.sleep(100);
				}
				catch(Exception e) {
					
				}
			}
			
		}
	}
	
}
