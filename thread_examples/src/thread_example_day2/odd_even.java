package thread_example_day2;

class Odd extends Thread
{
	public void run()
	{
		 for(int i=0; i<50; i++)
		 {
			 if(i%2 != 0)
			 {
				 System.out.println(i);
				 try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		 }
	}
}

class Even extends Thread
{
	public void run()
	{
		 for(int i=0; i<50; i++)
		 {
			 if(i%2 == 0)
			 {
				 System.out.println(i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
		 }
	}
}
public class odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Odd thread1 = new Odd();
		
		try {
			thread1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Even thread2 = new Even();
		
		
		thread1.start();
		thread2.start();
		
		System.out.println("Main thread");
		
		
	}

}
