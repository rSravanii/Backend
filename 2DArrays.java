// 2 DIMENTIONAL ARRAYS
//Q1: UNDERSTANDING HOW INPUT AAND OUTPUT OF 2D ARRAYS WILL WORK
import java.util.Scanner;

class InputAndOutput2darrays{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns");
        int columns = sc.nextInt();
        int[][] arr = new int[rows][columns];
        System.out.println("Enter the elements of array");
        //outer loop is for rows
        for(int i = 0; i < rows ; i++){
            //inner loop for columnm
            for(int j = 0 ; j < columns ; j++){
                arr[i][j] = sc.nextInt();
               // System.out.print(Arrays.toString(arr));// System.out.print(Arrays.toString(a));
            }
        }
        System.out.println("The elements of array are(matrix):");
        for(int i = 0 ; i < rows ; i++){
            for (int j = 0 ; j < columns ; j++){
                   System.out.print(arr[i][j] + " ");
                   
            }
             System.out.println();
        }
    }    
}

//2q: write a matrix using user inputs and search for x element in the matrix and return its indexes

class searchElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows");
        int rows = sc.nextInt();
        System.out.println("enter the colums");
        int colums = sc.nextInt();
        System.out.println("enter the elements");
        int[][] arr = new int[rows][colums];
        for (int i = 0 ; i < rows; i++){
            for(int j = 0 ; j < colums ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("the entered elements are:");
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < colums ; j++){
                    System.out.print(arr[i][j] + " ");
            }
            System.out.println();
            }
        System.out.print("enter the selected element");
        int x = sc.nextInt();
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < colums ; j++){
                if(arr[i][j] == x){
                    System.out.println("the element x is at the indexes: " + i + "," + j);
                }
            }
        }
    }
}

//3q: calculate the sum of 2 matrixes

class sumOfMatrix{
    public static void main(String[] args){
        int[][] A ={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("matrix A is:" );
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        int[][] B ={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("matrix B is:" );
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                System.out.print(B[i][j] + " ");
            }
            System.out.println();   
        }
        int[][] C = new int[3][3];
        for(int i = 0 ; i < 3 ;i++){
            for(int j = 0 ; j < 3 ; j++){
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        System.out.println("the sum of matrix A and B is");
        for(int i = 0; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
