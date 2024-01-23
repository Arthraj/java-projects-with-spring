package que3;

public class DaemonThread extends Thread {
	public DaemonThread(String name){
        super(name);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaemonThread d1= new DaemonThread("d1");
		DaemonThread d2= new DaemonThread("d2");
		DaemonThread d3= new DaemonThread("d3");
		
		d1.setDaemon(true);
		d2.setDaemon(true);
		
		d1.start();
		d2.start();
		d3.start();

	}
	
	public void run() {
		
		if(Thread.currentThread().isDaemon()){
            System.out.println(getName() + " = Daemon thread");
        } 
        else{
            System.out.println(getName() + " = User thread");
        }
	}

}
