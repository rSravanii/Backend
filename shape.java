// interface and abstraction combination 
// q.. Shape Interface (calculate area with using circle and rectangle classes ,etc )

public interface shape {

    void calculateArea();
    //void circle(double radius);
    //void rectangle(double length, double breadth);
}
class circle implements shape{
    private double radius ;//
    
    public circle(double radius){
        this.radius = radius;
    }
    @Override
    public void calculateArea(){
        double area = 3.14 * radius * radius;
        System.out.println("the area of the circle is: " + area);
    }

}
class rectangle implements shape{
    private double length;
    private double breadth;
    
    public rectangle(double length , double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    public void calculateArea(){
        double area = length * breadth;
        System.out.println("the are of the rectangle is: " + area);
    }
}
class areaOfShape{
    public static void main(String[] args) {
        shape c = new circle(4);
        shape r = new rectangle(4,3);
        
        c.calculateArea();
        r.calculateArea();
    }
}

