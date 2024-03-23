
/*
write a program that starts a thread  and prints its state after each significant event(creation, starting,and termination). Use
Thread.sleep() to simulate long-runnning tasks and Thread.getState() to print the thread's state
 */



public class f_prob100{
public static void main(String[] args) throws InterruptedException {
    ThreadState t1 = new ThreadState();
    System.out.printf("Created the Thread %s\n",t1.getState());
    t1.start();
    t1.join();
    System.out.printf("\nThread finished %s\n",t1.getState());
}

    public static class ThreadState extends Thread{
        @Override
    public void run(){
        try {
            Thread.sleep(4000);
            System.out.printf("From inside run %s",Thread.currentThread().getState());

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        
    }
    }
}
