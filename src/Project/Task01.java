package Project;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		/*1. Using Scanner create an array of integer values. After
		the array is created, calculate the sum of all stored
		elements in that array.*/

		 Scanner scan=new Scanner(System.in);

	      int num;   
	      System.out.println("Enter the total number of elements ");
	      num=scan.nextInt();    

	      int arr[]=new int[num]; 
	      System.out.println("Enter the elements of the array ");
	      for(int i=0; i<num ;i++)    
	      {
	          arr[i]=scan.nextInt();
	      }
	      int sum = 0;      
	    
	      for( int n: arr) 
	      {
	          sum = sum+num;  
	      }
	       
	        System.out.println("The sum of all the elements in the array is = "+sum);
	        


	}

}
