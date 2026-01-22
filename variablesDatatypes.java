import java.util.Scanner;

class types{
    public static void main(String[] args){
        //declaring all  primitive data types and variables :
        byte bit = 25;
        System.out.println("the byte is ;"+ bit);//the size of byte is 1 byte
        int num = 35000;
        System.out.println("the integer value is :"+num);//the size of int is 4 bytes 
        float floatNum = 3.45f;
        System.out.println("the float value is :"+floatNum); // THE SIZE OF FLOAT IS 4 BYTES
        double doubleNum = 3.14d;
        System.out.println("the double value is :"+ doubleNum); // the size of double is 8 bytes
        char charector = 'A';
        System.out.println("the char is:"+ charector); //the size of char is 2 bytes
        boolean bool = true;
        System.out.println("the boolean value is:"+bool);//the size of boolean is 1 byte and sometimes depends on jvm

         // type casting 
         //type 1 example:
         byte b = 120;
         int num1 = (int) b ;//converts the byte to int value without any data lose
         System.out.println("the  widened byte value os:" + num1);
   
            //type 2 example:
            float fNum = 78.96f;
            int integer = (int) fNum; //converts the float to int value with data lose of 0.96
            System.out.println("the narrowed float value is:"+ integer);

            // user details like taking input from user: name,age,height then print a formatted output

            // here for this we need the scanner package  called java.util.scanner

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your name:");
            String name = sc.nextLine();
            System.out.println("Enter your age:");
            int age = sc.nextInt();
            System.out.println("Enter your height:");
            double height = sc.nextDouble();
            System.out.println("Name: " + name + ", Age: " + age + ", Height: " + height);
            sc.close();

    }
}


