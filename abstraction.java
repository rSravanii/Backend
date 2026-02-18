//shape using abstract class
//also calculate area of circle and rectangle using abstract class

abstract class shape{
     abstract void calculateArea();
     void display(){
        System.out.println("Displaying shape");
     }
}
class circle extends shape{
    double radius;
    circle(double r){// constructor
        radius=r;
    }
    @Override
    void calculateArea(){
        System.out.println("it is circle");
        System.out.println("Area of circle: " + (3.14 * radius * radius));
    }
} 
class rectagle extends shape{
    double length, width;
    rectagle(double l, double w){//constructor
        length = l;
        width = w;
    }
    @Override
    void calculateArea(){
        System.out.println("it is rectangle");
        System.out.println("Area of rectangle: " + (length * width));
    }
}public class abstraction{
    public static void main(String[] args) {
       
        circle c = new circle(5.0);
        c.display();
        c.calculateArea();
        rectagle r = new rectagle(5, 3);
        r.display();
        r.calculateArea();
        
    }           
}/*output
Displaying shape
it is circle
Area of circle: 78.5
Displaying shape
it is rectangle
Area of rectangle: 15.0
*/