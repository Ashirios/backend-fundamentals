import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import org.junit.jupiter.api.Test;





public class TestRunnable {
    @Test
    public void testAppRunnable() throws InterruptedException {
        Runnable runnable = () ->{
            try (InputStream is = getClass()
            .getClassLoader()
            .getResourceAsStream("sample.txt");
         BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {

        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(Thread.currentThread().getName() + ": " + line);
        }

    } catch (Exception e) {
        e.printStackTrace();
    }
        };

        Executor executor = Executors.newSingleThreadExecutor();
        executor.execute(runnable);

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
