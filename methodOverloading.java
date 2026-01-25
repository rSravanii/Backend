import java.util.*;
//calculator overloading
class calculatorOverloading{
    void add(int a , int b){ 
        System.out.println(a + b); //method signature
    }
    void add(int a , int b, int c ){
        System.out.println( a + b + c); 
    }
    void add(double a , double b){
        System.out.println( a+b); //method signature
    }
    public static void main(String[] args){//main method
        calculatorOverloading c = new calculatorOverloading();//object creation
        c.add(24,57);                     //output: 81
        c.add(10,20,30);               //output: 60
        c.add(2.34556 , 9.012567);       //output: 11.358127
        
    }
}
//area calculator using method overloading

class AreaCalculator{
    public double area(double a){
        return 3.14*a*a ; //area of circle
    }
    
    public static double area(double  a ,double b){
        return a*b ; //area of rectangle
    }
    public double area( double a , double b , boolean isTriangle){
        return 0.5*a*b ; //area of triangle
    }
    public static void main(String[] args){
        AreaCalculator area = new AreaCalculator();
        System.out.println("Area of circle: " + area.area(2));  //output: Area of circle: 12.56
        System.out.println("Area of rectangle: " + area.area(4,4)); //output: Area of rectangle: 16.0
        System.out.println("Area of triangle: " + area.area(3,4,true)); //output: Area of triangle: 6.0
    }
}
//type promotion demo means automatic type conversion

class TypePromotionDemo{
    void show(int a , double b){
        System.out.println("int and double method called: " + (a+b)); //int is promoted to double
    }
    void show(double a , int b){
        System.out.println("double and int method called: " + (a+b)); //int is promoted to double
    }
    public static void main(String[] args){
        TypePromotionDemo t = new TypePromotionDemo(); //object creation
        t.show(5,6.7); //output: int and double method called: 11.7
        t.show(7.8,9); //output: double and int method called: 16.8
    }
}
 
 
