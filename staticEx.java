/*The static keyword in Java is used to define members (variables, methods, blocks, or nested classes)
 that belong to the class itself rather than to any specific object. This means they are shared across
  all instances of the class and can be accessed without creating an object
  */
// static variable = class variable
// static method = class method
//a block can also be static, which is executed when the class is loaded into memory
//nested class can also be static, which means it can be accessed without an instance of the outer class

class person{
    String name;
    static String cityName;
    void student(String name){
        this.name = name;
    }
}
public class staticEx{
    public static void main(String[] args) {
        person.cityName = "hyderabad";
        person p1 = new person();
        person p2 = new person();
        p1.name = "sravani";
        p2.name = "kishore";
        System.out.println(p1.name + " lives in " + person.cityName);
        System.out.println(p2.name + " lives in  " + person.cityName);

    }
}