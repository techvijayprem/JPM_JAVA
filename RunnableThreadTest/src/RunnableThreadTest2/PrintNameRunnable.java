package RunnableThreadTest2;


 class PrintNameRunnable implements Runnable {

 Thread thread;

 PrintNameRunnable(String name) {
     thread = new Thread(this, name);
     thread.start();
 }

 
 public void run() {
     String name = thread.getName();
     for (int i = 0; i < 10; i++) {
         System.out.print(name);
     }
 }
}