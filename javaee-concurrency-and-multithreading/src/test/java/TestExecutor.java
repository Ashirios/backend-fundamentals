import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

import com.example.dao.UserDao;
import com.example.runnanbles.UserProcessor;





public class TestExecutor {



    @Test
    public void testExecutionService(){
        ExecutorService service = Executors.newFixedThreadPool(3);
        //ExecutorService service = Executors.newFixedThreadPool(3);
        //ExecutorService service = Executors.newSingleThreadExecutor();
        List<String> users = getUsersFromFile("sample.txt");

        UserDao dao = new UserDao();

        for(String user : users){
            Future<Integer> future = service.submit(new UserProcessor(user, dao));
            try {
                 System.out.println("Result of operation : " + future.get());
            } catch (InterruptedException e) {
                Logger.getLogger(TestExecutor.class.getName()).log(Level.SEVERE, null, e);
            }catch(ExecutionException ex){
                Logger.getLogger(TestExecutor.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }

        service.shutdown();

        System.out.println("Main execution over!");
    }



    
   public List<String> getUsersFromFile(String filename){
      List<String> users = new ArrayList<>();
      try(InputStream is = getClass()
                .getClassLoader()
                .getResourceAsStream(filename);
                BufferedReader reader = new BufferedReader(new InputStreamReader(is))){
                    String line;
                    while((line = reader.readLine()) != null){
                        users.add(line);
                }
                }catch(Exception e){
                    e.getStackTrace();
                }
      return users;
      
   } 



}
