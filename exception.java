/* EXCEPTIONS: An abnormal event that disruptsprogram flow
ex: divide by zero, null reference , invalid input, file not found

Types of Exceptions: 1. Checked and 2.Unchecked 
try catch finally throw throws

 */

 // Basic Arthematic Exception:
 //nullpointer Exception:
 import java.util.Scanner;
 class exception{
    public void  arthematicException(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("enter the value of b: ");
        int b = sc.nextInt();
        try {
            int c = a/b;
            System.out.println("the result is : " + c);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
    public void nullpointerException(){
        try {
            int[]  arr = null;
            int length = arr.length;
            System.out.println("length : " + length);
            
        } catch (NullPointerException e) {
            System.out.println("Error: Tried to access a null array!");
            e.printStackTrace();
        }
    }  
    public static void main(String[] args) {
        exception ex = new exception();
        
        ex.arthematicException();
        ex.nullpointerException();
    }
 }
