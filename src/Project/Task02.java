package Project;

import java.util.Scanner;
import java.util.Arrays;

public class Task02 {

	public static void main(String[] args) {
		/*2. Using Scanner create an array of countries. When an
          array is created, retrieve all values from it and while
          retrieving those values print capital for each country.
          (use 2 different loops).*/
		
		  Scanner scanner = new Scanner(System.in);
	        System.out.println("Please enter how many countries you want to process");
	        int size = scanner.nextInt();
	        
	        String[] countries = new String[size];
	        String[] capitals = new String[size];

	  
	        scanner.nextLine();

	        for (int i = 0; i < size; i++) {
	            System.out.println("Please Enter the country name");
	            countries[i] = scanner.nextLine();

	            System.out.println("Please Enter the capital for " + countries[i]);
	            capitals[i] = scanner.nextLine();
	        }
	       
	        System.out.println(Arrays.toString(countries));
	        System.out.println(Arrays.toString(capitals));

	        for (int i = 0; i < size; i++) {

	            System.out.println("The Country " + countries[i] + " Has the capital " + capitals[i]);

	        }

	    }
	}
