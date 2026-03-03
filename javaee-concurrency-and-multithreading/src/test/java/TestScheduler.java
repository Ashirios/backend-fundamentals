import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;

import com.example.runnanbles.CleaningScheduler;



public class TestScheduler {

    @Test
    public void testScheduler() throws InterruptedException{
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();

        //it will start afetr 5 seconds 
        //service.schedule(new CleaningScheduler(), 5, TimeUnit.SECONDS);

        //the programm will start after 3 seconds then will continue after every 2 seconds
        //service.scheduleAtFixedRate(new CleaningScheduler(), 3, 2, TimeUnit.SECONDS);

        
        //the programm will start after 2 second then after finishing first work it take delay - 4 second and then bedin n-work
        service.scheduleWithFixedDelay(new CleaningScheduler(), 2, 4, TimeUnit.SECONDS);

        Thread.sleep(20000);
        service.shutdown();

    }
}
