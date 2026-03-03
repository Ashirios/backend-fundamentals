package com.example.animals;

public class Cat extends Animal {

    @Override
    public String makeSound(){
        return "Meow";
    }

    public String scratch(){
        return "Scratching the furniture!";
    }
}
