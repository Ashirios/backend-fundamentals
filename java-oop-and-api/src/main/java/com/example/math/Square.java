package com.example.math;

public class Square extends Rectangle {

    public Square(double length, double width) {
        super(length, width);
    }

    @Override
    public double caclulateParemeter(){
        return sides * getLength();
    }

    
}