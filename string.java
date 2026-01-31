//1q. Write a Java program to count the number of characters in a string
// Input: Java is super  output: 13
import java.util.Scanner;
import java.util.Arrays;

class StringLength{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the input string ");
        String s1 = sc.nextLine();
        System.out.println("the lenght of the given string is:");
        int s1Length = s1.length();
        System.out.println(s1Length);
    }
    
}/*input: enter the input string 
Java is super
the lenght of the given string is:
13*/

//2q: Write a Java program to count the number of words in a string 
//input: Java is super output: 3

class wordsCount{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the input string ");
        String string = sc.nextLine();
        System.out.println("the number of words in the given string is:");
        String[] string1 = string.split(" ");
        String[] arr = string1;
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
        
    }
}//input: enter the input string
//Java is super
//the number of words in the given string is:
//[Java, is, super]
//3


//3q: Write a Java program to count the total number of occurrence of a given character in a string
// Input: Hello World  targeted character: l output: 3 

class charOccurrence{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the input string ");
        String s1 = sc.nextLine();
        String c= "l";
        String[]  arr = s1.split("");
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i].equals(c)){
                sum = sum +1;
            }
        }System.out.println(sum);
    }
}//input: enter the input string
//Hello World   
//[H, e, l, l, o,  , W, o, r, l, d]
//3

//4q: Write a java program to reverse the string
// input: java is super output: repus si avaj

class stringReverse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the input string ");
        String s1 = sc.nextLine();
        //System.out.println(s1.reverse());
        String reversed = "";
        for(int i = s1.length() - 1 ; i >= 0 ;i--){
            reversed = reversed + s1.charAt(i);
        }System.out.println(reversed);
    }
}//input: enter the input string
//java is super
//repus si avaj

// 5q: Write a Java program to remove all the starting and ending spaces from a string
// Input <space>< space ><space>Hello<space >world <space ><space>
// output : Hello <Space> World

class removeSpace{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the input string ");
        String s1 = sc.nextLine();
        String s2 = s1.trim();
        System.out.println(s2);
    }
}//input: enter the input string
//    Hello world
//Hello world

