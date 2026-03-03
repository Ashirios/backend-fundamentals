package org.example.preparingcode;

import java.time.LocalDateTime;
import java.util.Arrays;

public class TestableCode {


    public static String[] knownNames = {
            "Alice",
            "Bob",
            "Charlie",
            "Diana"
    };
    public static String[] specialNames = {
            "Eve",
            "Frank",
            "Noah",
            "Bob"
    };
  

    public String greetUser(String name){
        String greetUser = "";
        
        if(Arrays.stream(knownNames).anyMatch(name::equals)){
                greetUser += "I know you, " + name + "!";
                if(Arrays.stream(specialNames).anyMatch(name::equals)){
                    greetUser += " You are even a special user.";
                }
        }else if(Arrays.stream(specialNames).anyMatch(name::equals)){
                greetUser += "I don't know you, " + name + ", but you are special!";
        } else {
                greetUser += "Hello Stranger!";
        }

        System.out.println(greetUser);
        return greetUser;
    }

    public String greetDay(LocalDateTime date){
        String dayPart = "";
        if(date.getHour() >= 0 && date.getHour() < 6){
            dayPart += "Good Night, " ;
        } else if (date.getHour() >= 6 && date.getHour() < 12) {
            dayPart += "Good morning, " ;
        }else  if (date.getHour() >= 12 && date.getHour() < 18) {
            dayPart += "Good afternoon, " ;
        }else  if (date.getHour() >= 18 && date.getHour() <= 23) {
            dayPart += "Good evening, " ;
        }
        return dayPart;
    }
}
