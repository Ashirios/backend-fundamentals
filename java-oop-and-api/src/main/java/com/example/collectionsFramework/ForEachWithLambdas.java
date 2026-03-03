package com.example.collectionsFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachWithLambdas {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        AddFruits.addFruit(fruits);
        fruits.forEach(x -> System.out.println(x));
        fruits.forEach(System.out::println);
        fruits.forEach(x -> {
            x = "fruits : " + x;
            System.out.println(x);
        });

        Map<Integer, String> fruitsMap = new HashMap<>();
        fruitsMap.put(1, "Banana");
        fruitsMap.put(2, "Cherry");
        fruitsMap.put(3, "Orange");

        fruitsMap.forEach((k, v) -> {
            v = "value -> " + v;
            System.out.println(k + " : " + v);
        });

    }

}
