/**
Write a program that create two threads. Wach should print "Hello from Thread X", where X is the number of the thread (1 or 2), 
ten times, then terminate.
*/

public class f_prob99 {
    public static void main(String[] args) {
        
    
    Thread1 t1 = new Thread1();
    Thread2 t2 = new Thread2();
    t1.start();
    t2.start();
    }
    public static class Thread1 extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello from Thread 1");
            }
        }
        
    }
    public static class Thread2 extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello from Thread 2");
            }
        }
        
    }
}
