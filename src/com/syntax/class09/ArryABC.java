package com.syntax.class09;

public class ArryABC {

	public static void main(String[] args) {
		/*task 1 create an array of char and store grades into it: A,B,C,D,E,F. array 
		 * Then print a grade B (use 2 different ways of creating an array).
		 */
		char[]Alphabets= {'A','B','C','D','E','F'};

		for(int i=0; i<Alphabets.length;i++)
		{
			System.out.print(Alphabets[i]+", ");
		}
		System.out.println("---------");
		
		//another way
		char[]Alphabet=new char[6];
		Alphabet[0]='A';
		Alphabet[1]='B';
		Alphabet[2]='C';
		Alphabet[3]='D';
		Alphabet[4]='E';
		Alphabet[0]='F';
		System.out.println(Alphabet[1]);
		
		
		 
          /*Create an array of names and store all names of your group.
          *Then print your name from that array. 
          *(use 2 different ways of creating an array).*/
		String[]names=new String[6];
		names[1]="sonam";
		names[2]="josh";
		names[3]="sam";
		names[4]="Cassandra";
		names[5]="Ahmadzai";
		System.out.println(names[1]);
		
		

	}

}
