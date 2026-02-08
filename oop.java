class BankAccount {
    String accountHolder;
    double balance;

    // Constructor
    BankAccount(String holder, double bal) {
        this.accountHolder = holder;
        this.balance = bal;
    }

    // Method
    void deposit(double amount) {
        balance += amount;
        System.out.println(accountHolder + " deposited " + amount);
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(accountHolder + " withdrew " + amount);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    // public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Sravani", 5000);
        BankAccount acc2 = new BankAccount("Rahul", 3000);

        acc1.deposit(2000); // Sravani deposited 2000
        acc2.withdraw(1000); // Rahul withdrew 1000
    }
}

// Student Progress Class
class Progress {
    int id;
    String studentName;
    double score;

    // Constructor using 'this'
    Progress(int id, String Name, double marks) {
        this.id = id;
        this.studentName = Name;
        this.score = marks;
    }

    // Display method
    void display() {
        System.out.println("The ID of student: " + id);
        System.out.println("The name of the student: " + studentName);
        System.out.println("The total score of the student: " + score);
    }

    // Grade method (no parameter, uses score field)
    void grade() {
        if (score > 500) {
            System.out.println("The student passed the examination");
        } else {
            System.out.println("The student failed the examination");
        }
    }

    public static void main(String[] args) {
        Progress stu1 = new Progress(6, "Sravani", 800);
        Progress stu2 = new Progress(5, "Radha", 600);
        Progress stu3 = new Progress(7, "Lolly", 400);

        stu1.display();
        stu1.grade();

        stu2.display();
        stu2.grade();

        stu3.display();
        stu3.grade();
    }
}