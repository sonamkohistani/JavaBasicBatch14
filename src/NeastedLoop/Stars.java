package NeastedLoop;

public class Stars {

	public static void main(String[] args) {
		for(int i=1; i<=5;i++) {
			for(int j=1; j<=6; j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		//square
		System.out.println("----------------");
		for(int i=1; i<=5;i++) {
			for(int j=1; j<=i; j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------");
		for(int i=1; i<=5;i++) {
			for(int j=1; j<=5; j++) {
				
				if(i==1 || i==5 || j==1 || j==5) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	
		}

	}


