package Class12;

public class StringDemo {

	public static void main(String[] args) {
		//Proper way of creating an object
		String str=new String("Java");
		String name="Sonam kohistani the Great";//only works for string and wrapper classes
		
		//create the number of characters in a string including the spaces
		
        System.out.println(str.length());
        System.out.println(name.length());
        if(name.length()>15) {
        	System.out.println("name can't be more than 15 characters ");
        	
        }
	}

}
