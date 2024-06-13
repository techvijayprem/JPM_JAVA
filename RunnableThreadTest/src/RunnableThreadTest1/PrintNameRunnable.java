package RunnableThreadTest1;

public class PrintNameRunnable extends Thread {
	
	String name;

	public PrintNameRunnable(String name) {
		super();
		this.name = name;
	}
	
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(name);
        }
    }

}
