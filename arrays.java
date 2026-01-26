//here are the few mandatory questiions in 1D array
//q1: array Input and Output 
import java.util.Arrays;
class arrayInoputOutput {
    public static void main(String[] args){
        //
        int[] a = new int[5]; //declaration and memory allocation
        System.out.println("initially the array is  :"+ a[0]);
        a[0]=50;
        a[1]=40;
        a[2]=60;
        a[3]=90;
        a[4]=100;
        System.out.println("after initialization the array is:"+ Arrays.toString(a)); // to print the entire array
    }
} //OUTPUT : initially the array is  :0
//after initialization the array is:[50, 40, 60, 90, 100]

//q2: sum and average of array elements
class arraySumAndAverage{
    public static void main(String[] args){
        int[] b = new int[5];
        System.out.println("firstly the initial array is:" + b[0]); //default value
        int sum = 0 ;
        for(int i = 0 ; i < b.length ; i++){
            b[0] = 1;
            b[1] = 2;
            b[2] = 3;
            b[3] =4;
            b[4] = 5;
            System.out.println("the array is :" + b[i]); //print each element
            
            sum = sum + (b[i]); //sum calculation
            
        }
        System.out.println("the final array is:" + Arrays.toString(b));
        System.out.println("the sum is:" + sum); //sum output
        System.out.println("the average is: " + (sum / (b.length))); //average output
    }
}/*  output : firstly the initial array is:0
the array is :1
the array is :2
the array is :3
the array is :4
the array is :5
the final array is:[1, 2, 3, 4, 5]
the sum is:15
the average is: 3 */

//q3: find maximum and minimum element in an array
class arrayMaxAndMin{
    public static void main(String[] args){
        int[] c = new int[4]; //declaration and memory allocation
        c[0] = 4;
        c[1] = 3;
        c[2] = 5;
        c[3] = 8;
        System.out.println(" the array is:" + Arrays.toString(c));
        if(c[0] > c[1] && c[0] > c[2]  && c[0] > c[3]){ //max calculation
            System.out.println(c[0] + "is the maximum array");
            
        }else if(c[1] > c[0]  && c[1] > c[2]  && c[1] > c[3]){
            System.out.println(c[1] + "is the maximum array");
        }else if(c[2] > c[0]  && c[2] > c[1]  && c[2] > c[3]){
            System.out.println(c[1] + "is the maximum array");
        }else {System.out.println(c[3] + "is the maximum array");
        }
        if(c[0] < c[1] && c[0] < c[2]  && c[0] < c[3]){ //min calculation
            System.out.println(c[0] + "is the minimum array");
            
        }else if(c[1] < c[0]  && c[1] < c[2]  && c[1] < c[3]){
            System.out.println(c[1] + "is the minimum array");
        }else if(c[2] < c[0]  && c[2] < c[1]  && c[2] < c[3]){
            System.out.println(c[1] + "is the minimum array");
        }else {System.out.println(c[3] + "is the minimum array");
        }
        
    }
} /*  output : the array is:[4, 3, 5, 8]
8is the maximum array
3is the minimum array */

//q4: search an element in an array
class searchElement{
    public static void main(String[] args){
       int[] d = { 3,6,9,5}; //declaration , memory allocation and initialization
        System.out.println("the array is :" + Arrays.toString(d)); //print the array
        //search an element 
        // let the searching number be 6
        int key = 6;
        for( int i = 0 ; i < d.length ; i++){
            if( key == (d[i])){
            System.out.println("the elemant is found at the index : " + i); //output if found
        }
        }
    }
}
/* output:the array is :[3, 6, 9, 5]
the elemant is found at the index : 1 */

