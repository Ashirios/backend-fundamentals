import com.example.runnanbles.LoggingProcessor;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;








public class TestLoggingProcessor {

    @Test
    public void testCallLogging() throws InterruptedException, ExecutionException{
        ExecutorService service = Executors.newFixedThreadPool(5);
        List<Callable<Boolean>> callable = new ArrayList<>();


        callable.add(new LoggingProcessor());
        callable.add(new LoggingProcessor());
        callable.add(new LoggingProcessor());
        callable.add(new LoggingProcessor());
        callable.add(new LoggingProcessor());
        callable.add(new LoggingProcessor());



        List<Future<Boolean>> futures = service.invokeAll(callable);

        for(Future<Boolean> f : futures){
            System.out.println("operation result " + f.get() );
        }

        System.out.println(service.invokeAny(callable));
        service.shutdown();
        service.awaitTermination(30, TimeUnit.SECONDS);
        
    }

}
