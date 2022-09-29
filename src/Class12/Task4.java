package Class12;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		/*Write a program that reads two people's first
		names and if they expecting boy or girl? 
		Based on the input suggests a name for a baby:
		Example Output:
		Mom’s first name? Mary
		Dad’s first name? Daniel
		Boy or Girl? boy
		Suggested baby name: DANRY

		Example Output:
		Mom’s first name? Mary
		Dad’s first name? Daniel
		Boy or Girl? girl
		Suggested baby name: MAIEL*/
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter your Dad names");
		String Mom=scan.next();
		System.out.println("please enter your Mom names");
		String Dad=scan.next();
		System.out.println("what your expecting boy or girl?");
		String gender=scan.next();
		if(gender.toLowerCase().equals("Girl")) {
            System.out.println(Dad.substring(0,Dad.length()/2)+(Mom.substring(Mom.length()/2)));

        }else if(gender.toLowerCase().equals("boy")) {
        	System.out.println(Mom.substring(0,Mom.length()/2)+(Dad.substring(Dad.length()/2)));
        	
        }
		

	}

}
