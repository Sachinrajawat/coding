
public class e_TestingSyncronized {
public static void main(String[] args) {
    long startTime = System.currentTimeMillis();
    Counter counter=new Counter();
    UpdaterThread t1 = new UpdaterThread(counter);
    UpdaterThread t2 = new UpdaterThread(counter);
    
    try {
        t1.start();
        // t1.join();
        t2.start();

        t1.join();
        t2.join();
    } catch (InterruptedException e) {
        System.out.println("Thread interrupted: "+e.getMessage());
    }
    long endTime = System.currentTimeMillis();
    System.out.printf("Final counter value: %d and time taken: %d",counter.getCount(),(endTime-startTime));
}

    static class Counter{
        private int count=0;
        public synchronized void increment(){
            count++;
        }
        public int getCount(){
            return count;
        }
    }

    static class UpdaterThread extends Thread{
        private final Counter counter;
        public UpdaterThread(Counter counter){
            this.counter=counter;
        }
        @Override
        public void run() {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        }
    }
}
