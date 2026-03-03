package com.example.collectionsFramework;

import java.util.HashSet;
import java.util.Set;

public class Iterators {


    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        
        AddFruits.addFruit(fruits);

        var i = fruits.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }


    
}
