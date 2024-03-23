public class d_TestingJoin {
    public static void main(String[] args) throws InterruptedException{
        long startTime = System.currentTimeMillis();

        FirstTask t1 = new FirstTask();
        SecondTask t2 = new SecondTask();
        ThirdTask t3 = new ThirdTask();
        System.out.println("\nStarting First Thread");
        
        t1.start();
        System.out.println("\nStarting Second Thread");
        
        t2.start();
        t1.join();//jb tk t1 complete nhi hoga tb tk aage waale thread start nhi hoga
        // t1.join(long millis);
        // t1.join(long millis, int nanos);
        System.out.println("\nStarting Third Thread");
        
        t3.start();

        long endTime = System.currentTimeMillis();
        System.out.printf("Total time taken: %d ",(endTime-startTime));
    
    }
public static class FirstTask extends Thread{
        @Override
        public void run() {
            //First Task
            for(int i=1;i<=1000;i++){
                System.out.printf("%d* ",i);
            }
            System.out.println("\n * task complete");
        }
    }
    public static class SecondTask extends Thread{
        @Override
        public void run() {
             //Second Task
            for(int i=1;i<=1000;i++){
                System.out.printf("%d$ ",i);
            }
            System.out.println("\n $ task complete");
        }
    }
    public static class ThirdTask extends Thread{
        @Override
        public void run() {
            // Third Task
            for(int i=1;i<=1000;i++){
                System.out.printf("%d# ",i);
            }
            System.out.println("\n # task complete");
        }
    }
}
