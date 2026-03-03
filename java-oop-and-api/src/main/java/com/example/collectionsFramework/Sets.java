package com.example.collectionsFramework;

import java.util.HashSet;
import java.util.Set;

public class Sets {

    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        
        AddFruits.addFruit(fruits); // Duplicate entry
        System.out.println("Set of fruits: " + fruits);
        
        //remove from set
        fruits.remove("Banana");
        System.out.println("Set of fruits after removing Banana: " + fruits);


        Set<String> moreFruit = Set.of("Mango", "Pineapple", "Grapes");
        System.out.println("Another set of fruits: " + moreFruit);

        // moreFruits become immutable
        // moreFruit.add("Papaya"); // This will throw UnsupportedOperationException
        // moreFruit.remove("Mango"); // This will also throw UnsupportedOperationException

    }

    
}
