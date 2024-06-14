package ThreadGroupTest;

public class ThreadGroupTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        new SimpleThread("Shibuya").start();
        new SimpleThread("New York").start();
        new SimpleThread("Seoul").start();
        
        
        ThreadGroup group = Thread.currentThread().getThreadGroup();
        System.out.println("Number of active threads in this thread group = " + group.activeCount());
        
        Thread[] tarray = new Thread[10];
        int actualSize = group.enumerate(tarray);
        
        for (int i=0; i<actualSize;i++){
            System.out.println("Thread " + tarray[i].getName()
                               + " in thread group " + group.getName());
        }
	}

}
