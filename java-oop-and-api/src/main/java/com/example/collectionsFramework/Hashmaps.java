package com.example.collectionsFramework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmaps {
    public static void main(String[] args) {
        
        Map<Integer, String> fruits = new HashMap<>();
        fruits.put(1, "Banana");
        fruits.put(2, "Cherry");
        fruits.put(3, "Orange");

        //if we put exist key with another value it will just update
        fruits.put(3, "Apple");
        //or we can use method putIfAbsent
        fruits.putIfAbsent(3, "Lemon");

        System.out.println(fruits);
        System.out.println("If Map contains value - Strawberry : " + fruits.containsValue("Strawberry"));
        System.out.println("If Map contains key - 2 : " + fruits.containsKey(2));

        //to create immutable map
        Map<Integer, String> moreFruits = Map.of(
            1, "Plum",
            2, "Pineapple",
            3, "Pear"

        );

        //to seperate keys or values into sets
        Collection<String> Values = fruits.values();
        Set<Integer> Keys = fruits.keySet();
        


    }

}
