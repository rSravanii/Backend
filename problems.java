import java.util.Scanner;
class problems{
    public static void main(String[] args) {
        // operators in java
        // q 1: 5/2.0 gives 2.5 in java ,why ,what is the concept in it ?
        System.out.println(5 / 2.0);// the expected output is 2.5,this is a floating point division..and this is the
                                    // type conversion or type casting concept in java

        //  q 2: Convert the given seconds into hours minutes and seconds 
       
        int totalSeconds = 3665;
        int hr = totalSeconds / 3600;
        int mint = (totalSeconds % 3600) / 60;
        int sec = (totalSeconds % 3600) % 60;
        System.out.println(hr);
        System.out.println(mint);
        System.out.println(sec);
        System.out.println(hr + "hour," + "" + mint + "mints," + "" + sec + "sec");// 1 hour,1mints,5sec

        // q3: How would you check if a ear is a leap year using modulus operator ?

        // checking leap year using modulus operator
        Scanner sc = new Scanner(System.in);// scanner class to take input from user
        System.out.println("enter the year :");
        int year = sc.nextInt();// taking year as input from user
        // Checking leap year using modulus operator
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {// leap year condition
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");// not a leap year condition
        }

        // conditional statements in java
        // q1: Checking the number whether the number is positive or negative or zero
        // using if else statements
        
        System.out.println("enter the number:");
        int number = sc.nextInt();
        if (number > 0) {
            System.out.println("the number is positive");
        } else if (number < 0) {
            System.out.println("the number is negative");
        } else if (number == 0) {
            System.out.println("the number  is zero");
        }

        // q2:the grade calculator taking the input, printing grade using if else
        // ladders

        System.out.println("enter the marks:");
        int marks = sc.nextInt();
        if (marks >= 90) {
            System.out.println("the grade is A");
        } else if (75 < marks && marks < 89) {
            System.out.println("the grade is B");
        } else if (74 > marks && marks > 50) {
            System.out.println("the grade is C");
        } else if (49 > marks && marks > 30) {
            System.out.println("the grade is D");
        } else if (29 > marks && marks >= 0) {
            System.out.println("the grade is E");
        }

        // q3: checking the number is even or odd using if else and also using ternary
        // operators and printing the result

        System.out.println("enter the number:");
        int ber = sc.nextInt();
        if (ber % 2 == 0) {
            System.out.println("the number is Even");
        } else if (ber % 2 != 0) {
            System.out.println("the number is Odd");
        }
        // q4:day of week- input number taking 1-7 and printing the day using switch

        System.out.println("enter the day number :");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break; // insted of using break ,we can also use arrow function (->) in java 14 version
                       // above;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Satday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Other day"); //expected output if i give 2 as input is Tuesday 

                /*
                 * case 1 -> System.out.println("Monday"); //break;
                 * case 2 -> System.out.println("Tuesday"); //break;
                 * case 3->System.out.println("Wednesday"); //break;
                 * case 4->System.out.println("Thursday"); //break;
                 * case 5-> System.out.println("Friday"); ////break;
                 * case 6-> System.out.println("Satday");//// break;
                 * case 7->System.out.println("Sunday"); //break;
                 * default->System.out.println("Other day");
                 */

        }
        // loops in java
        // q1: print numbers 1 to 100 using for loop and while loop
        int i;
        for( i = 1; i<=100 ; i++){  //using for loop 
            System.out.print(i);//expected output 1 2 3 ....100
        }
        System.out.print("==============================");
        int j = 1;
        while( j<=100){      //using while loop
            System.out.print(j);//expected output 1 2 3 ....100
            j++;
        }
        // q2: sum of digits ,taking an input number and calculating sum of digits using while loop
        System.out.println("enter the number:");
        int n = sc.nextInt();
        int sum = 0;
        while(n >0){
            int digit = n%10;
            sum = sum+digit;
            n = n / 10;
            System.out.println(sum);//if we give input as 123 ,output will be 1 3 6
            
        }
        //q3: multiplication table - taking an input number, printing table up to 10
        System.out.println("enter the number for multiplication:");
        int multiplierNumber = sc.nextInt();
        for(int l = 0 ; l <= 10 ; l ++){
            System.out.println(multiplierNumber +"*"+l+ "="+(multiplierNumber*l) ); 
            //if we give input as 5 ,output will be 5*0=0,5*1=5...5*10=50
        }
        sc.close();
    }
}

