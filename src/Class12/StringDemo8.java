package Class12;

public class StringDemo8 {

	public static void main(String[] args) {
		String str="Batch 14 is good 81247818!@##%#^ ASAKBSAKJSBN kajbjakfdnb";
		/*
		 * replace method replace one string with another in a string 
		 * replaceAll it takes a pattern and replace all the characters that follow
		 */
        System.out.println(str.replace("good", "Excellent"));
        System.out.println(str.replaceAll("[a-z]", ""));

	}

}
