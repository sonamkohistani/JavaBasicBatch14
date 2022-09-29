package com.syntax.class09;

public class ForEachLoops {

	public static void main(String[] args) {
		//only when we deal with array or collections
		//we can use for each loops,enhanced for loop,advance for loop
		
		String[]icecream= {"vanilla", "choclate","kulfi","mango","pistshio"};
		for(String ice:icecream) {
			System.out.print(ice+"; ");
		}
		System.out.println();
		char[]letters= {'A','B','C','D','E'};
		for(char let:letters) {
			System.out.print(let+", ");
		}
		System.out.println();
		int[]numbers= {12,56,345,1,0,9};
		//get all  element of regular for loop
		for(int i=0; i<numbers.length;i++){
			System.out.print(numbers[i]+", ");
		}
		//get all value using enhanced for loop
		System.out.println();
		for(int num:numbers) {
			System.out.print(num+", ");
			
		}
		

	}

}
