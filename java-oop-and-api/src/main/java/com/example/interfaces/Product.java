package com.example.interfaces;

public interface Product {
    String getName();
    void setName(String name);

    default int getPages(){return 0;}
    default void setPages(int pages){}

}