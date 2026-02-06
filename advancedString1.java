import java.util.Scanner;
import java.util.Arrays;

class emailValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the email id: ");
        String str = sc.nextLine();
        if (str.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            System.out.println("email is valid");
        } else {
            System.out.println("email is not valid");
        }
    }/*
      * output: enter the email id: ravul@gmail.com
      * email is valid
      */
}

//shortest compression of the given string
class ShortestCompression {
    public static void main(String[] args) {
        String s = "aaabbcddd", r = "";//input string and result string
        int c = 1;//count of characters
        for (int i = 1; i < s.length(); i++)//start from index 1 
        {
            if (s.charAt(i) == s.charAt(i-1)) c++;//counting the same characters 
            else { r += s.charAt(i-1) + "" + c; c = 1; }//when different character found, append previous character and its count to result and reset count
        }
        r += s.charAt(s.length()-1) + "" + c;//append last character and its count, after loop ends
        System.out.println(r);//output: a3b2c1d3
    }
}

//StudentMarks.java
class StudentMarks { 
    public int sum(int arr[]){ 
        int sum = 0; 
        for(int i = 0 ; i < arr.length ; i++){
            sum+= arr[i]; 
            
        }return sum;
    } 
    public int average(int arr[]){ 
        int average = 0; 
        int sum = 0; 
        for(int i = 0 ; i < arr.length ; i++){ 
            sum+= arr[i];
        }
        return sum/arr.length;
    }
    public static int max(int arr[]){
        int max = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }return max;
        
    }
    public static int min(int arr[]){
        int min = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }return min;
        
    }
    public static void main(String[] args){
    StudentMarks SM = new StudentMarks();
    System.out.println(SM.sum(new int[]{23,34,35,67,87}));
    System.out.println(SM.average(new int[]{23,34,35,67,87}));
    System.out.println(max(new int[]{23,34,35,67,87}));
    System.out.println(min(new int[]{23,34,35,67,87}));
        
    }
    //output: 246
    // 49   
    // 87
    // 23

}

class palindromeWord{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String:");
        String input = sc.nextLine();
        StringBuilder sb1 = new StringBuilder(input);
        StringBuilder sb2 = new StringBuilder(sb1).reverse();
        if(sb1.toString().equals(sb2.toString())){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }/*output: enter the String: madam
          true*/  
}

//UtilityMethods(revrseString,find max,countvovels)
class UtilityMethod{
    public String reverseString(){
        StringBuffer sb1 = new StringBuffer("reverse");
        StringBuffer sb2 = new StringBuffer();
        return sb1.reverse().toString();
        
    } 
    public static void main(String[] args){
        UtilityMethod um = new UtilityMethod();
        System.out.println(um.reverseString());
    }// output: esrever
}

