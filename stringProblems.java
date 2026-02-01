//q: Write a Java program to modify the string in the following pattern 
//change the odd words to uppercase and reverse the even words
// input : this is a test string  OUTPUT: THIS si a test string

import java.util.Arrays;
import java .util.Scanner;

class StringModify{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the input string:");
        String s1 = sc.nextLine();
        String[] arr = s1.split(" ");
        System.out.println(Arrays.toString(arr));
        for(int i = 0 ; i < arr.length ; i++){
            if(i % 2 == 0){
                System.out.print(arr[i] = arr[i].toUpperCase() + " ");
            } else {
                StringBuilder sb = new StringBuilder(arr[i]);
                arr[i] = sb.reverse().toString();
                System.out.print(arr[i] + " ");
            }
        }
        //output: enter the input string:
        // this is a test string
        // THIS si A tset STRING
        
    }
}

//q: Write a Java program to reverse each word of a given string
// Input: Java is easy output: avaj si ysae

class wordReverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the input string:");
        String s1 = sc.nextLine();
        String[] arr = s1.split(" ");
        System.out.println(Arrays.toString(arr));
        for(int i = 0 ; i < arr.length ; i++){
            String reverse = new StringBuilder(arr[i]).reverse().toString();
            System.out.print(reverse + " ");
        }
    }//output: enter the input string:
 // Java is easy
 // avaj si ysae

}

//q: write a java program to find the count of uppercase letters,lowercase letters, digits and special charecters in a given string 
//input: JavA5is&Su6p%eR output:Uppercase letters - 4 lowercase letters - 6 Digits - 2 Special characters - 3

class CountCharacters{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the input string:");
        String s1 = sc.nextLine();
        int upper = 0;
        int lower = 0;
        int digit = 0;
        int special = 0;
        for(int i = 0 ; i < s1.length() ; i++){
            char ch = s1.charAt(i);
            if(Character.isUpperCase(ch)){
                upper++;
            } else if(Character.isLowerCase(ch)){
                lower++;
            } else if(Character.isDigit(ch)){
                digit++;
            } else {
                special++;
            }
        }
        System.out.println("Uppercase letters - " + upper);
        System.out.println("lowercase letters - " + lower);
        System.out.println("Digits - " + digit);
        System.out.println("Special characters - " + special);
    }//output: enter the input string:
 // JavA5is&Su6p%eR
 // Uppercase letters - 4
 // lowercase letters - 6
 // Digits - 2
 // Special characters - 3
}



