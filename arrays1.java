import java.util.Arrays;
/*1q*/import java.util.Scanner;
class reverseArray{
    public void reverse(){
        int[] arr = new int[5]; // declaring and initializing the array
        Scanner s = new Scanner(System.in); // creating the scanner object to take input from user
        System.out.println("enetr the 5 elements into the array");
        System.out.print(" the array will be ");
        for(int i = 0 ; i < arr.length ; i++){

            arr[i] = s.nextInt(); // taking input from user
            System.out.print( arr[i] + " ");// printing the original array

        }
        System.out.println(" ");
        System.out.println("reversed the given array");
        for(int i = 4 ; i >= 0 ; i--){
            System.out.print(arr[i]+" "); // printing the reversed array
        }

    }
    public static void main(String[] args){
        reverseArray rs = new reverseArray(); // creating the object of the class
        rs.reverse(); // calling the method using the object
    }
} /*output:
enter the 5 elements into the array
 the array will be 1 2 3 4 5
 reversed the given array
 5 4 3 2 1 */

/*2q*/ 

class EvenOddCounting{
    public void counting(){
        //int[] a = new int[5];
        int[] a = {23,45,67,78,43}; // declaring and initializing the array
        int even = 0;
        int odd = 0;
        System.out.println("the array is :" + Arrays.toString(a)); // printing the array
        for(int i = 0 ; i < a.length ; i++){// traversing through the array
            if(a[i] % 2 == 0){
                even = even +1;// counting the even numbers
                
            }
            else if(a[i]%2 != 0){
                odd = odd+1;// counting the odd numbers
               
            }
            
        }
        System.out.println("the even count is :"+ even);// printing the even count
        System.out.println("the odd counting is"+ odd);// printing the odd count
            
       
    }
    public static void main(String[] args){
        EvenOddCounting count = new EvenOddCounting(); // creating the object of the class
        count.counting();// calling the method using the object
    }
}/*the array is :[23, 45, 67, 78, 43]
the even count is :1
the odd counting is4 */ 

/*3q*/
class secondLargestElement{
    public static void main(String[] args) {
        int[] b = {23, 45, 67, 78, 43};
        System.out.println("the array is: ");
        System.out.println(Arrays.toString(b)); // Print original array
        // Insertion Sort
        for (int i = 1; i < b.length; i++) {
            int key = b[i];
            int j = i - 1;// Move elements of b[0..i-1], that are greater than key,

            while (j >= 0 && b[j] > key) {// Find the correct position for key
                b[j + 1] = b[j]; // Shift element to the right
                j--; // Move to the next element
            }
            b[j + 1] = key; // Place key at its correct position
        }

        // Print sorted array
        System.out.println("Sorted array: ");
        for (int num : b) {// Enhanced for loop to print elements
            System.out.print(num + " ");// Print each element
        }
        System.out.println(" ");
        System.out.println("the second largest element in the array : " + b[1]); // Second largest element after sorting
    }
}/*output: the array is: 
[23, 45, 67, 78, 43]
Sorted array:
23 43 45 67 78
the second largest element in the array : 43*/

/*4q*/
class removeDuplicates{
    public void duplicates(int[] d){
        int rd = 0; // rd is the index of the last unique element found
        for(int i = 1 ; i < d.length ; i++){
            if(d[rd]!=d[i]){ // compare the current element with the last unique element
                rd++;// increment the index of the last unique element
                d[rd]=d[i];// update the last unique element with the current element
            }
        }
        
    }
    public static void main(String[] args){
        removeDuplicates remove = new removeDuplicates();// creating the object of the class
        int[] d = {1,1,4,5,6,7,7,8}; // declaring and initializing the array
        System.out.print("the original sorted array is: " );
        for (int i = 0 ; i<d.length ; i++){
            System.out.print(d[i] + " "); // printing the original array
        }
        remove.duplicates(d);
        System.out.println();
        System.out.print("the array after removing duplicates is: " );
        for(int  i = 0 ; i < d.length ; i ++){
            System.out.print(d[i] + " "); // printing the array after removing duplicates
        }
        System.out.println(" ");    
         System.out.print("the array after removing duplicates (only unique elements) is: ") ;
        for(int j= 0 ; j<6 ; j++){

            System.out.print(d[j] + " "); // printing the array after removing duplicates (only unique elements)
        }
    }
}/*output:
the original sorted array is: 1 1 4 5 6 7 7 8 
the array after removing duplicates is: 1 4 5 6 7 8
the array after removing duplicates (only unique elements) is: 1 4 5 6 7 8 */

