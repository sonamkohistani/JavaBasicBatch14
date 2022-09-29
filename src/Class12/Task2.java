package Class12;

public class Task2 {

	public static void main(String[] args) {
		/*Create a String and if the String is not empty perform the following: 
          *if the String has an odd number of characters and has 3 or more characters, print the character in the middle of the String.*/
		  String str="hello";
		    int length=str.length();
		    if(!str.isEmpty()&&length%2!=0&&length>=3) {

		        int middleIndex=length/2;
		        System.out.println(str.charAt(middleIndex));
     
    		 
    	 }
    	 
     }
	}


	/* String str=new String("Drink");
     int length=str.length();
     if(!str.isEmpty()) {
    	 if(str.length()>3&&str.length() %2==1){
    		 System.out.println(str.charAt(length/2));*/
