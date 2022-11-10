package lab01;

import java.util.Scanner;
public class Cong2MaTran {
	 public static void main(String args[]){
	      int m, n, i, j;
	      Scanner in = new Scanner(System.in);
	 
	      System.out.println("Input number of rows of matrix");
	      m = in.nextInt();
	      System.out.println("Input number of columns of matrix");
	      n  = in.nextInt();
	 
	      int array1[][] = new int[m][n];
	      int array2[][] = new int[m][n];
	      int sum[][] = new int[m][n];
	 
	      System.out.println("Input elements of first matrix");
	 
	      for (  i = 0 ; i < m ; i++ )
	         for ( j = 0 ; j < n ; j++ )
	            array1[i][j] = in.nextInt();
	 
	      System.out.println("Input the elements of second matrix");
	 
	      for ( i = 0 ; i < m ; i++ )
	         for ( j = 0 ; j < n ; j++ )
	            array2[i][j] = in.nextInt();
	 
	      for ( i = 0 ; i < m ; i++ )
	         for ( j = 0 ; j < n ; j++ )
	             sum[i][j] = array1[i][j] + array2[i][j]; 
	 
	      System.out.println("Sum of the matrices:-");
	 
	      for ( i = 0 ; i < m ; i++ ){
	         for ( j = 0 ; j < n ; j++ )
	            System.out.print(sum[i][j]+"\t");
	 
	         System.out.println();
	      }
	  }
}

