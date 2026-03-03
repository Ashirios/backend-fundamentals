package com.example.runnanbles;

import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingProcessor implements Callable<Boolean> {
    
    


    @Override
    public Boolean call() throws Exception{
        System.out.println(Thread.currentThread().getName() + " : LoggingProcessor started");
        Logger.getLogger(LoggingProcessor.class.getName()).log(Level.INFO, "Logging error with calling LoggingProcessor");
        return true;
    }
}
