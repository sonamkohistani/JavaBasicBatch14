package com.syntax.class09;

public class Animals {

	public static void main(String[] args) {
		String[] animals= {"cat","dog","lion","pig","bear"};
		
		for(int i=0;i< animals.length;i++) {
			System.out.println(animals[i]);
			
			System.out.println("-------------");
			//another way...........
			
			for(String animal:animals) {
				System.out.println(animal+" ");
		}

	}

	}}
