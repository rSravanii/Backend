//polymorphism hass 2 topics - 1. method overloading
//2. method overriding 

// here are few problems on method overloading and method overriding together
//1. animal-> dog, cat, lion (runtime polymorphism)

import javax.swing.event.SwingPropertyChangeSupport;

class Animal {
    void sound() {
        System.out.println("Different animals will  make  dofferent sounds");
    }
}

class dog extends Animal {

    @Override
    void sound() {
        System.out.println("dog will bark");
    }
}

class cat extends Animal {

    @Override
    void sound() {
        System.out.println("cat  makes meow sounds");
    }
}

class lion extends Animal {

    @Override
    void sound() {
        System.out.println("lion roars loudly");
    }
}

public class overriddingEx1 {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new dog();
        Animal a3 = new cat();
        Animal a4 = new lion();
        a1.sound();
        a2.sound();
        a3.sound();
        a4.sound();
    }
}
/*
 * Different animals will make dofferent sounds
 * dog will bark
 * cat makes meow sounds
 * lion roars loudly
 */

// 2. Employee-> manager, developer, tester (Salary calculation)
class Employee {
    void SalaryCalculation() {
        int Salary = 50000;
        System.out.println("Employee salary is: " + Salary);
    }
}

class manager extends Employee {
    @Override
    void SalaryCalculation() {
        int Salary = 80000;
        System.out.println("Manager salary is: " + Salary);
    }
}

class developer extends Employee {
    @Override
    void SalaryCalculation() {
        int Salary = 100000;
        System.out.println("Developer salary is: " + Salary);
    }
}

class tester extends Employee {
    @Override
    void SalaryCalculation() {
        int salary = 90000;
        System.out.println("tester salary is: " + salary);
    }
}

public class polymorphismEx2 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new manager();
        Employee e3 = new developer();
        Employee e4 = new tester();
        e1.SalaryCalculation();
        e2.SalaryCalculation();
        e3.SalaryCalculation();
        e4.SalaryCalculation();

    }
}
