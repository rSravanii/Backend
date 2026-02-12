//inheritance ...q) person -> student
class person{
    String Name;
    int Age;
    public person(String name, int age ){//constructor
        this.Name = name;
        this.Age = age;
    }
    public void details(){//method
        System.out.println("Name: "+Name);
        System.out.println("Age: "+Age);
    }
}
class student extends person{
    int marks;
    int grade;
    public student(int marks, int grade){//constructor
        super("sravani", 21);//super keyword is used to call the constructor of the parent class
        this.marks = marks;
        this.grade = grade;

    }
    public void exam(int marks, int grade){//method
        this.marks = marks;//this keyword is used to refer to the current object
        this.grade = grade;

    }
}
public  class inheritancToStudent{//main method
    public static void main(String[] args){//object creation
        student student = new student(90, 10);//constructor is called
        student.details();//method is called
        System.out.println("Marks: "+student.marks);//marks is accessed using the object of the student class
        System.out.println("Grade: "+student.grade);//grade is accessed using the object of the student class
    }
}
/*output:
Name: sravani
Age: 21
Marks: 90
Grade: 10
*/
