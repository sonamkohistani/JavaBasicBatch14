package Project;

public class Task06 {

	public static void main(String[] args) {
		/*Write a program to swap 2 numbers without a
         temporary variable?*/
		int x = 15;
        int y = 5;
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swapping:" + " x = " + x + " and y = " + y);
                          
    }

	
}
