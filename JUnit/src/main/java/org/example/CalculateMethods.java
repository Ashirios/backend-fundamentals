package org.example;

public class CalculateMethods {
    public double sum(double a, double b){
        return a+b;
    }

    public double divide(double a, double b){
        if( b == 0 ) throw new ArithmeticException();
        return a/b;
    }

    public double product(double i, double i1) {
        return i*i1;
    }
}
