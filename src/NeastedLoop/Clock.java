package NeastedLoop;

public class Clock {

	public static void main(String[] args) {
	 for(int h=0; h<24; h++) {//controls hours
		 for(int m1=0; m1<=5; m1++) {//controls first digits of minute
			 for(int m2=0; m2<=9; m2++) {//controls second digits of minute
				 if(h <10) {
					 System.out.println("0"+ h+":"+ m1+m2);
				 }
				 else {
					 System.out.println(h+":"+ m1+m2);
				 }
			 }
			 
		 }
	 }

	}

}
