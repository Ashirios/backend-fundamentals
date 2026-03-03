package com.example.runnanbles;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class CleaningScheduler implements Runnable {

    




    @Override
    public void run() {
       
        try(InputStream is = getClass()
                            .getClassLoader()
                            .getResourceAsStream("server_log.txt");
                            
                            BufferedReader reader = new BufferedReader(new InputStreamReader(is))){

                            String line;
                            while((line = reader.readLine()) != null){
                                System.out.println("Str ===>>> " + line );

                            }

        }catch(Exception e){
            e.getStackTrace();
        }
    }
}
