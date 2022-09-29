package com.syntax.class09;

public class Drinks {

	public static void main(String[] args) {
		String[] drinks= {"fanta", "milk", "juice", "lemonade","water","tea"};
		System.out.println(drinks[2]);//juice
		
		int size=drinks.length;//-->will give# of element in the array
		System.out.println("size of array= "+size);
		
		System.out.println("----------");
		String[]icecream= {"vanilla", "choclate","kulfi","mango","pistshio"};
		
		//System.out.println(icecream[0]);
		//System.out.println(icecream[1]);
		
		for(int i=0; i<icecream.length;i++) {
			System.out.print(icecream[i]+", ");
			
		}
		System.out.println("--------------------");
		
		
		
		

	}

}
