//person.java Encapsulation example
//name age using getters and setters
class person{
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0){
        this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }
    
    public static void main(String[] args) {//testing the person class
        person p = new person();
        p.setName("Ravula Sravani");
        p.setAge(21);
        System.out.println("Name: " + p.getName() + ", Age: " + p.getAge());
    }
}

//bankAccount (upgrade the code by adding deposit and withdraw methods and balance variable)
//deposit and wihthdraw only and no negative balance
class bankAccount{
    private String accountHolderName; 
    private double balance;
    
    /**
     * @param customer //account holder name
     * @param initialBalance //initial balance for the account, must be non-negative
     */
    public bankAccount(String customer , double initialBalance) { //constructor to initialize account holder name and initial balance
        this.accountHolderName = customer;
        this.balance = initialBalance;
    }
    public String getAccountHolderName() {//getter for account holder name
        return accountHolderName;
    }

    public double getBalance() {//getter for balance
        return balance;
    }

    public boolean deposit(double amount) {//method to deposit money into the account, returns true if successful
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount) {//method to withdraw money from the account, returns true if successful and does not allow negative balance
        if (amount > 0 && balance >= amount) {//check if the amount is positive and if there are sufficient funds
            balance -= amount;
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        //easy way to test the bankAccount class
        bankAccount account = new bankAccount("Ravula Sravani", 1000.0);
        System.out.println("Account Holder: " + account.getAccountHolderName());//print account holder name
        System.out.println("Initial Balance: " + account.getBalance());//print initial balance

        account.deposit(500.0);//deposit money into the account
        System.out.println("Balance after deposit: " + account.getBalance());//print balance after deposit
        boolean withdrawSuccess = account.withdraw(200.0);//withdraw money from the account
        System.out.println("Balance after withdrawal: " + account.getBalance());//print balance after withdrawal
        boolean withdrawFail = account.withdraw(1500.0);//attempt to withdraw more than the balance, should fail
        System.out.println("Attempt to withdraw more than balance: " + (withdrawFail ? "Success" : "Failed"));//print result of withdrawal attempt

    }
}