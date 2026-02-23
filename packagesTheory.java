import java.util.Scanner;

class InputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Hello, " + name);
    }
    /*PS C:\Users\ravul\OneDrive\Desktop\Backend> javac packagesTheory.java
PS C:\Users\ravul\OneDrive\Desktop\Backend> java InputExample
Enter your name:
sravani
Hello, sravani */
}
/* Here:
- java → top-level package
- util → sub-package
- Scanner → class inside util */

// File: MyPackage/MyClass.java
package MyPackage;

public class MyClass {
    public void display() {
        System.out.println("Hello from MyPackage!");
    }
}
// File: TestPackage.java

// import MyPackage.MyClass; 
public class TestPackage {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.display();
    }
}



