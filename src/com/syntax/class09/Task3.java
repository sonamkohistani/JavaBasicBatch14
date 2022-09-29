package com.syntax.class09;

public class Task3 {

	public static void main(String[] args) {
		//create an array of word: java,Saturday,day,coding,is, print the following sentence using element of array: 
		//"Saturday is java coding day".
		String[]word= {"java","Saturday","day","coding","is"};
		System.out.println(word[1]+" "+word[4]+" "+word[0]+" "+ word[3]+" "+ word[2]);
		
		System.out.println("-----------------");
		//another way..
		String[]words=new String[5];
		words[0]="java";
		words[1]="Saturday";
		words[2]="day";
		words[3]="coding";
		words[4]="is";
		System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+ words[3]+" "+ words[2]);
		
		

	}
	

}
