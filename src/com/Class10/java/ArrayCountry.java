package com.Class10.java;

public class ArrayCountry {

	public static void main(String[] args) {
		String[][] countries ={
				{"USA","Canada"},//1 array with index 0
				{"Peru","Brazil","Colombia","Ecuador"},//2 array with index 1
				{"Ethiopia","Egypt","Kenya"},//raw 3
				{"Germany","Turkiye","Moldova","Ukraine"},//raw 4
				{"Kazakhstan","Afghanistan","Korea"}
				

		};
		System.out.println(countries.length);//total number of arrays or rows
		
		int eleme1=countries[0].length;
		System.out.println("# of element from 1 array ="+eleme1);
		
		int eleme2=countries[1].length;
		System.out.println("# of element from 2 array ="+eleme2);
		System.out.println("----------getting all values from 2d array-----");
		for(int r=0; r<countries.length;r++) {//loops over rows
			for(int c=0; c<countries[r].length;c++) {
				System.out.print(countries[r][c]+",");
				
			}
			System.out.println();
		}
		

	}

}
