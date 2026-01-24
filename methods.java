//q 1: write a method to calculate (calculator Method ) - addition,subtraction,multiplication,division?
class calculator{
    public static int addition( int a , int b){
        return a+b;  //method for addition 
    }
    public int subtraction (int a, int b){
        return a-b;  // method for subtraction
    }
    public  static int multiplication (int a, int b){
        return a*b;   // method for multiplication
    }
    public int division (int a, int b){
        return a/b;    // method for division 
    }
    public static void main(String[] args){
        System.out.println("addition is : " + addition(30,40));
        calculator m = new calculator(); // method calling
        System.out.println("subtraction is : " + m.subtraction(40,20));
        System.out.println("multiplication is : " + multiplication(10,10));
        System.out.println("division is : " + m.division(40,8));
        
    }
} // output: addition is : 70  subtraction is : 20  multiplication is : 100  division is : 5

//q 2: Write a method to find the maximum number between two numbers?
 class MaxOfTwo{
     public int maxoftwo(int a , int b){
         if(a>b){
             return a;
         }
         else{
             return b;
         }
     }
     public static void main(String[] args){
         MaxOfTwo maxoftwo = new MaxOfTwo();
         int result = maxoftwo.maxoftwo(35,50);
         System.out.println("the maximum of given two numbers is:"+ result );
     }
     
 } // output: the maximum of given two numbers is:50

//q 3: Write a method to find the maximum number between three numbers?
class MaxOfThree{
     public int maxofthree(int a , int b ,int c){
         if(a>b && a>c){
             return a;
         }
         else if (b>a && b>c){
             return b;
         }
         else {
             return c;
         }
     }
     public static void main(String[] args){
         MaxOfThree maxofthree = new MaxOfThree();
         int result = maxofthree.maxofthree(15,25,75);  // method calling
         System.out.println("the maximum of given three numbers is:"+ result );
     }
 } // output: the maximum of given three numbers is:75

//q 4: Write a method to check whether a number is even or odd?
class EvenOdd{
    private int  evenOrodd(int a){
        if(a%2==0){// even number condition
           System.out.println(a+"it is a even number");
        }
        else{
            System.out.println(a + "it is  odd number ");
        }
         return a;
    }
    public static void main(String[] args){
        EvenOdd EO = new EvenOdd();// object creation
        int result = EO.evenOrodd(67);
        System.out.println(result);
    }
} // output:67it is  odd number 

//q 5: Write a method to check whether a year is leap year or not?
class leapYearMethod{// class creation  
    public static  int leapyear(int a){
        if (a % 400 == 0 || (a % 4 == 0 && a % 100 != 0)) {// leap year condition
            System.out.println(" is a leap year");
        } 
        else {
            System.out.println(" is not a leap year ");// not a leap year condition
        }
        return a;// returns the year
    }
    public static void main(String[] args){
        int result = leapyear(1376);// method calling
        System.out.println(result);// prints the year
        
    }
} // output:1376 is a leap year.

//q 6: Write a method to print the Fibonacci series?
class fibonacciMethod{// class creation
    public void fibonacciSeries(){// method creation
        int a = 0;
        int b =1;
        int n=10;
        int c;
        for(int i = 0 ; i <= n ; i++){
            c = a + b ;
            System.out.print(" "+ c); // prints the series
            a = b;
            b = c;
        }    
    }
    public static void main(String[] args){// main method
        fibonacciMethod f = new fibonacciMethod(); // object creation
        f.fibonacciSeries();  //prints the series directly
    }
}
// output:  1 2 3 5 8 13 21 34 55 89 144

//q 7: Write a method to display the multiplication table?
class multiplicationMethod{
    public void multitable(int a){
        int n = 10;
        System.out.println("the table of "+a+" is");
        for(int i = 0 ; i <= n ; i++){
            
            System.out.println(a + "*" +i+ "="+(a*i));
        }
    }
    public static void main(String[] args){
        multiplicationMethod mul = new multiplicationMethod();
        mul.multitable(23);
    }
}

