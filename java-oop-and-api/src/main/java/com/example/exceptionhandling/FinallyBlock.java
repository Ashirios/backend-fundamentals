package com.example.exceptionhandling;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class FinallyBlock {


    public static void main(String[] args) throws IOException {
        InputStream input = FinallyBlock.class.getClassLoader().getResourceAsStream("input.txt");
        
       try(BufferedReader reader = new BufferedReader(new InputStreamReader(input))){
        String line;
            while( (line = reader.readLine()) != null){
                System.out.println(line);
            }   
       }catch(FileNotFoundException | InputMismatchException e){
            e.printStackTrace();
       }finally{
            try {
                input.close(); 
            } catch (Exception e) {
                
            }
       }
    }


}
