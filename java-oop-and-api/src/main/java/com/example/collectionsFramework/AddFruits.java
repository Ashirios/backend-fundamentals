package com.example.collectionsFramework;

import java.util.Collection;

public class AddFruits {

    public static Collection addFruit(Collection c){
        c.add("Apple");
        c.add("Banana");
        c.add("Orange");
        c.add("Apple"); 
        return c;
    }

    


}
