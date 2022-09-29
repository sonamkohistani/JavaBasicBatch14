package com.syntax.class09;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] arr=new int[4];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		System.out.println(arr[3]);
		
		System.out.println(arr[3]+arr[1]);
		
		System.out.println("-----------------");
		//create an array to store your classmate names
		String[] names=new String[5];
		names[0]="sonam";
		names[1]="saira";
		names[2]="mansour";
		names[3]="muboraka";
		names[4]="sam";
		System.out.println("hello "+names[0]);
		
		System.out.println("--------");
		int[]nums=new int[3];
		nums[1]=12;
		nums[2]=13;
		System.out.println(nums[1]);//lease value waste the time
		

	}

}
