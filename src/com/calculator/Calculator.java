package com.calculator;

public class Calculator {
    public int add(int a, int b){
        return a+b;
    }
    public int subtract(int a, int b){
        return a-b;
    }
    public int multipiy(int a, int b){
        return a*b;
    }
    public double divide(int a, int b){
        if(b == 0){
            throw new ArithmeticException("cannot divide by zero");
        }else{
            return (double) a/b;
        }
        
    }
}
