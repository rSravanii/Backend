//LC 1480 - Running Sum of 1d Array

import java.util.Scanner;
import java.util.Arrays; //importing Arrays class for using toString method
class runningSum{ //class name
    public void runningSumArray(){
        int[] arr = new int[10]; //declaring an array of size 10
        Scanner sc = new Scanner(System.in); //scanner class object
        System.out.println("enter the elements");//taking input from user
        for(int i = 0 ; i < arr.length ; i++){ //looping through the array
            arr[i] = sc.nextInt(); //storing input in array
            
        }System.out.println("the original array is: "+Arrays.toString(arr)); //printing original array
        int[] num = new int[10]; //declaring another array to store running sum
        num[0] = arr[0]; //initializing first element of running sum array
        for(int j = 1; j < arr.length; j++){ //looping through the array starting from index 1
            num[j]= num[j-1]+arr[j]; //calculating running sum
        }
        System.out.println("the running sum array is : "+Arrays.toString(num)); //printing running sum array
        sc.close(); //closing scanner object
      
    }
    public static void main(String[] args){
        runningSum sum = new runningSum(); //creating object of class
        sum.runningSumArray(); //   calling the method
    }
}
/*output:
enter the elements
12 23 4 56 78 90 78 67 67 89 
the original array is: [12, 23, 4, 56, 78, 90, 78, 67, 67, 89]
the running sum array is : [12, 35, 39, 95, 173, 263, 341, 408, 475, 564] */
