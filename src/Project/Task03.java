package Project;

public class Task03 {

	public static void main(String[] args) {
		/*3. Create a 2D array of integer values. Print the sum of
		all numbers.*/

		int[][] numbers = { { 1,4,7 }, { 13, 2, 45 }, { 500, 450, 1000, -2, 19 }, };
		int sum = 0;

		for (int[] num:numbers) {
		    for (int n:num) {
		        sum+=n;
		    }
		}
		    System.out.println(sum);
	}
	}


