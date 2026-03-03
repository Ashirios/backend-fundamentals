package com.example.collectionsFramework;

import java.util.ArrayList;
import java.util.List;

public class Lists {

    public static void main(String[] args) {
        
        List<String> fruits = new ArrayList<>();
       AddFruits.addFruit(fruits);
        //we can add duplicate
        fruits.add("Orange");

        System.out.println(fruits);

        //we can set another fruit with index
        fruits.set(2, "lemon");
        System.out.println("List after replace orange with lemon on index 2 : "+fruits);

        fruits.add("Cherry");
        System.out.println("Last index of Cherry : "+fruits.lastIndexOf("Cherry"));
        System.out.println("First index of Cherry : "+fruits.indexOf("Cherry"));

        //to remove by index whether it will delete first fruits that it will find
        fruits.remove(4);

        //to create immutable list of fruits
        List moreFruits = List.of("Banana", "Mango", "Apple", "Melon");

    }

}
