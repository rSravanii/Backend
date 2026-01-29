//greatest common divisor
//method 1:
//using method and object  with arraylist for finding factors and common factors 

import java.util.ArrayList;
import java.util.Scanner;
public class gcd{
    public int greatestCommonMethod(int m,int n){
        ArrayList<Integer> fm = new ArrayList<>();
       for(int i = 1;i<=m;i++){
           if(m%i==0){
               fm.add(i);
           }
       } 
       ArrayList<Integer> fn = new ArrayList<>();
       for(int j = 1;j<=n; j++){
           if(n%j==0){
               fn.add(j);
           }
       }
       ArrayList<Integer> cf = new ArrayList<>();
       for(int f : fm){
           if(fn.contains(f)){
               cf.add(f);
           }
       }
       return cf.get(cf.size()-1);
    }
    public static void main(String[] args){
        gcd g = new gcd();
        int result = g.greatestCommonMethod(32,16);
        System.out.println(result);
    }
}//output:16

//method 2:
//using single main method with arraylist for finding factors and common factors
//import java.util.Scanner;
//import java.util.ArrayList;
class greatestCommonDivisor{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> fm = new ArrayList<>();
        ArrayList<Integer> fn = new ArrayList<>();
        ArrayList<Integer> cf = new ArrayList<>();
        System.out.println("enter the 2 numbers to know the gcd");
        int m = sc.nextInt();
        //System.out.println(m);
        int n = sc.nextInt();
        //System.out.println(n);
        System.out.println("gcd of" + m + "and" + n+ "is:");
        
        for(int i = 1; i<=m ;i++){
            if(m%i==0){
                fm.add(i);
            }
        }
        for(int j = 1; j<=n;j++){
            if(n%j==0){
                fn.add(j);
            }
        }
        for(int f : fm){
            if (fn.contains(f)){
                cf.add(f);
                 
            }
        }
        int result = cf.get(cf.size() - 1);
        System.out.println(result);
        sc.close();
    }
}//output:
//enter the 2 numbers to know the gcd
//32
//16
//gcd of32and16is:
//16
