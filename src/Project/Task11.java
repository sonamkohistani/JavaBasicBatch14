package Project;

public class Task11 {

	public static void main(String[] args) {
		// Write a program to print out duplicate elements from
		  //an Array of Strings?

		
		String[] name= {"Sonam","Heda","Sonam","Emad","Mansour","Saira"};
        for(int i=0;i<name.length;i++) {
            for(int j=i+1;j<name.length;j++) {
                if(name[i]==name[j])
                    System.out.println(name[j]+" ");

	}

}}}
