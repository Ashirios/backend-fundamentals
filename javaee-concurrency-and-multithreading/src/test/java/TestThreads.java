import com.example.ThreadResolverParameter;
import com.example.runnanbles.AppThread;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;


@ExtendWith(ThreadResolverParameter.class)
public class TestThreads {

    @Test
    public void testAppThread(AppThread thread1, AppThread thread2, AppThread thread3) throws InterruptedException {
        thread1.start(); //RUNNABLE 
        thread2.start();
        thread3.start();

        
        thread1.join();
        thread2.join();
        thread3.join();

        //execute run //RRUNNING
        //job completed - TERMINATED/DEAD
    }
}
