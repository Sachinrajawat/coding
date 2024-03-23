import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class g_Executor {
    public static void main(String[] args) {
        ExecutorService service=Executors.newSingleThreadExecutor();
        d_TestingJoin task1=new d_TestingJoin();
        // service.submit(task1);
        service.shutdown();
    }
}
