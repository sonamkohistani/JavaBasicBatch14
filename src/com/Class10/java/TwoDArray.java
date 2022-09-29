package com.Class10.java;

public class TwoDArray {

	public static void main(String[] args) {
		int[][]bigarray=new int[3][4];{
			//1 row
			bigarray[0][0]=10;
			bigarray[0][1]=20;
			bigarray[0][2]=30;
			bigarray[0][3]=40;
			
			// 2 row
			bigarray[1][0]=100;
			bigarray[1][1]=200;
			bigarray[1][2]=300;
			bigarray[1][3]=400;
			
			// 3 row
			bigarray[2][0]=1;
			bigarray[2][1]=2;
			bigarray[2][2]=3;
			bigarray[2][3]=4;
			//how to access element from 2d array?
			System.out.println(bigarray[1][2]);//300
			
			
			
		}

	}

}
