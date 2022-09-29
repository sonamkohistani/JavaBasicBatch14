package Project;
import java.util.Arrays;

public class Task10 {

	public static void main(String[] args) {
		// Write a java program to find the second largest
		//number in the array
		//1,4,5,12,3,2 first we should sort the array in ascending order
		//1,2,3,4,5,12
		
		
		int []num= {1,2,3,4,5,12};
		Arrays.sort(num);
		System.out.println("the secound largest number in the array is ="+num[num.length-2]);
		
	
}}
