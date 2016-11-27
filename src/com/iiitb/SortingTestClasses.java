package com.iiitb;

import java.util.Scanner;

public class SortingTestClasses {
	public static void main(String []args) {
	    int n, c, d, swap;
	    Scanner in = new Scanner(System.in);
	 
	    System.out.println("Input number of integers to sort");
	    n = in.nextInt();
	 
	    int array[] = new int[n];
	    int array1[]=new int[n];
	 
	    System.out.println("Enter " + n + " integers");
	 
	    for (c = 0; c < n; c++) 
	      array[c] = in.nextInt();
	 
	    
	    array1=bubblesort(array);
	    System.out.println("Sorted list of numbers");
	 
	    for (c = 0; c < n; c++) 
	      System.out.println(array1[c]);
	  }
	  public static int[] bubblesort(int array[]){
		  for (int c = 0; c <array.length; c++) {
		      for (int d = 0; d < array.length- c-1; d++) {
		        if (array[d] > array[d+1]) /* For descending order use < */
		        {
		         int  swap       = array[d];
		          array[d]   = array[d+1];
		          array[d+1] = swap;
		        }
		      }
		    }
		  return array;
	  }
	

}