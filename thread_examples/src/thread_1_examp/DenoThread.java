package thread_1_examp;

public class DenoThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread1 th1 = new Thread1();
		th1.start();  // thread class
			
		Thread2 th2 = new Thread2();
		Thread th = new Thread(th2);
		
		th.start();
		
	}

}
