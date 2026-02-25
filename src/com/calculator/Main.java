package com.calculator;

public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println("addition is : " + cal.add(10, 5));
        System.out.println("substraction is : " + cal.subtract(10, 5));
        System.out.println("Multiplication is : " + cal.multipiy(10, 5));
        System.out.println("division is : " + cal.divide(10, 5));

    }

}
