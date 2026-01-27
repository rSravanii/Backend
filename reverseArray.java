//reverse the given elements in array as input is array size and elements ,output is reverser order of elements

import java.io.*;
import java.util.*;

class Result {
    /*
     * Complete the 'reverseArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY a as parameter.
     */
    public static List<Integer> reverseArray(List<Integer> a) {
    // Write your code here
    int start = 0 ; // Initialize start pointer
    int end = a.size() - 1; // Initialize end pointer
    while(start < end ){
        int temp = a.get(start);// Swap elements at start and end pointers
        a.set(start , a.get(end));// Set value at start to value at end
        a.set(end,temp);// Set value at end to temp
        start++;// Move start pointer forward
        end--;// Move end pointer backward
    }
    return a;

    }

}

public class reverseArray {
    public static void main(String[] args) throws IOException { // Main method to handle input and output
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); // Prepare to read input from standard input
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH"))); // Prepare to write output to a file

        //int arrCount = Integer.parseInt(bufferedReader.readLine().trim()); // Read the size of the array

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" "); // Read the array elements as a string and split by spaces

        List<Integer> arr = new ArrayList<>(); // Initialize an empty list to store the array elements

        for (int i = 0; i < 4; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]); // Parse each element from the input
            arr.add(arrItem);
        }

        List<Integer> res = Result.reverseArray(arr);

        for (int i = 0; i < res.size(); i++) {
            bufferedWriter.write(String.valueOf(res.get(i)));// Write each element to the output

            if (i != res.size() - 1) {
                bufferedWriter.write(" "); // Add a space between elements, except after the last one
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
