//Written by Adrian Alvarez
import java.util.Scanner;

public class Matrix_addition {

	public static void main(String[] args) {
			Scanner keyboard = new Scanner (System.in);
			System.out.println("Enter the number of rows for matrix1:");
        int row1 = keyboard.nextInt(); // Row size for matrix1
        	System.out.println("Enter the number of columns for matrix1:");
	    int column1 = keyboard.nextInt(); // Column size for matrix1

	    	System.out.println("Enter the number of rows for matrix2:");
        int row2 = keyboard.nextInt(); // Row size for matrix2
        	System.out.println("Enter the number of columns for matrix2:");
	    int column2 = keyboard.nextInt(); // Column size for matrix2
        
        
        int matrix1[][] = new int[row1][column1];//this code sets up 3 matrices of integers one of them being the sum of the other 2.
        int matrix2[][] = new int[row2][column2]; 
        int sum[][] = new int[row1][column1];
        System.out.println("Please enter matrix1 data");
        
        for(int i = 0; i < row1; i++) {// this for loop takes in the row and column sizes of the first matrix
        	for(int j = 0; j < column1; j++) {
        		matrix1 [i][j] = keyboard.nextInt();
        	}
        }
 System.out.println("Please enter matrix2 data");
        
        for(int i = 0; i < row2; i++) {// this for loop takes in the row and column sizes of the 2nd matrix
        	for(int j = 0; j < column2; j++) {
        		matrix2 [i][j] = keyboard.nextInt();
        	}
        }
       
        System.out.println("Matrix 1");// This code prints out the completed first matrix
        for(int i = 0; i < row1; i++) {
        	for(int j = 0; j < column1; j++) {
        		System.out.print(matrix1[i][j]+" ");
        	}
        		System.out.println();
        }
        System.out.println("Matrix 2");// this code prints out the completed 2nd matrix
        for(int i = 0; i < row2; i++) {
        	for(int j = 0; j < column2; j++) {
        		System.out.print(matrix2[i][j]+" ");
        	}
        		System.out.println();
        		
        	}
        System.out.println("sum of both matrices");
       for(int i = 0; i < row1; i++) {// this code grabs both matrices using sum and prints them out.
    	   for(int j =0; j < column1; j++) {
    		   sum[i][j] = matrix1[i][j] + matrix2[i][j];
    		   System.out.print(sum[i][j]+" ");
    	   }
    	   System.out.println();
       }
        		
        	}

	}


