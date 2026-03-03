package com.example.collectionsFramework;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {

    public static void main(String[] args) {
        Queue<String> fruits = new LinkedList<>();

        AddFruits.addFruit(fruits);

        //will remove Apple FIFO
        var removed = fruits.remove();

        System.out.println(fruits);

        //return first fruits which was added
        System.out.println("Head of queue : " + fruits.peek());


    }

}
