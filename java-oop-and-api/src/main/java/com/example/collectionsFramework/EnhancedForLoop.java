package com.example.collectionsFramework;

import java.util.ArrayList;
import java.util.List;

public class EnhancedForLoop {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        AddFruits.addFruit(fruits);

       for(String fruit : fruits){
        System.out.println(fruit);
       }
    }

}
