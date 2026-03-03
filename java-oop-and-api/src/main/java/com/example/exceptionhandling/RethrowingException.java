package com.example.exceptionhandling;

import java.io.FileReader;
import java.io.IOException;

public class RethrowingException {

    public void readFile() throws IOException{
        //rethrow it to the method which call it
        FileReader reader = new FileReader("input.txt");

    }

    public void startProcess() {
        try {
            //exception will append here
            readFile(); 
        } catch (IOException e) {
            System.out.println("Sorry file is missing");
        }
    }

}
