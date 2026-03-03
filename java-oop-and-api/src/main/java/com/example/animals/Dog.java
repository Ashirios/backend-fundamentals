package com.example.animals;

public class Dog extends Animal {
    @Override
    public String makeSound(){
        return "Bark";
    }

    public String fetch(){
       return "Fetching the ball!";
    }

}
