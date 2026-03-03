import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.jupiter.api.Test;

import com.example.custom.CustomThreadFactory;
import com.example.runnanbles.LoggingProcessor;



public class TestThreadFactory {

    @Test
    public void testThreadFactory(){
        ExecutorService service = Executors.newFixedThreadPool(3, new CustomThreadFactory());

        for(int i = 0; i < 6; i++){
            service.submit(new LoggingProcessor());
        }

    }

}
