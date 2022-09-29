package com.syntax.class09;

public class Cars {

	public static void main(String[] args) {
	
		String[]cars= {"Ford","Toyota","Nissan","Dodge","Lamborghini"};
		for(int i=0; i<cars.length;i++)
		System.out.println(cars[i]);
		
		System.out.println("-----------");
		//other way
		for(String car:cars) {
			System.out.println(car+" ");
		} 
		
	}

}
