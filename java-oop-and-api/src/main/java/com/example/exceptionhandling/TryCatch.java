package com.example.exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TryCatch {
    public static void main(String[] args) throws IOException {
        InputStream input = TryCatch.class.getClassLoader()
                        .getResourceAsStream("nonexistent.txt");

        try (BufferedReader reader = new BufferedReader(
                        new InputStreamReader(input))) {
    
                String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }

        
    }

}
