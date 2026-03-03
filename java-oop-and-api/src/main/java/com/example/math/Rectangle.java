package com.example.math;

public class Rectangle extends Shape {

    protected double length;
    protected double width;
    protected int sides = 4;

    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    

    public double caclulateParemeter(){
        return 2 * (length + width);
    }

    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public int getSides() {
        return sides;
    }
    public void setSides(int sides) {
        this.sides = sides;
    }

    


    @Override
    public double calculateArea() {
        return length * width;
    }


}
