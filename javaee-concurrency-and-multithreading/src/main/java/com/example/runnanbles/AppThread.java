package com.example.runnanbles;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class AppThread extends Thread {

    
    @Override
    public void run() {
    try (InputStream is = getClass()
            .getClassLoader()
            .getResourceAsStream("sample.txt");
         BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {

        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

    } catch (Exception e) {
        e.printStackTrace();
    }

    
}

    


}
