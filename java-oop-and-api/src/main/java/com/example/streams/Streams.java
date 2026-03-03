package com.example.streams;

import java.util.List;

public class Streams {

    public static void main(String[] args) {
        List<String> vegetables = List.of(
            "Gabbage",
            "Cucumber",
            "Carrot",
            "Tomato",
            "Onion"
        );

        boolean result = vegetables.stream().anyMatch(v -> v.contains("o"));
        System.out.println(result);

        //print only vegetables with "C"
        vegetables.stream()
                  .filter( x -> x.startsWith("C"))
                  .forEach(System.out::println);  

    
        //print strings into uppercase
        vegetables.stream()
                    .map(x -> x.toUpperCase())
                    .forEach(System.out::println);

        //sort and print
        //or use reduce to collect into another form -> [| Gabbage | Cucumber | ...]
        vegetables.stream()
                    .sorted()
                    //.reduce("", (a, b) -> a + " | " + b)
                    .forEach(System.out::println);

       
        
    }

}
