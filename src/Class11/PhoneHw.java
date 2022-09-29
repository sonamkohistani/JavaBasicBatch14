package Class11;

public class PhoneHw {
	String name;
	String make;
	String model;
	String color;
	double size;
	int memory;
	void call() {
		System.out.println("can video calls ");
	}
	void takepicture() {
		System.out.println("Taking pictures");
	}
	public static void main(String[]args) {
		
		Phone iphone=new Phone();
		 iphone.make="Apple";
		 iphone.model="Iphone 14 pro Max";
		 iphone.color="purple";
		 iphone.storage=256;
		 iphone.size=6.7;{
			System.out.println(iphone.model+" has different colors like "+iphone.color); 
			
			
			System.out.println("********************");
			
			Phone pixel=new Phone();
			pixel.model="pixel 6 pro"; 
			pixel.color="Grey";
			pixel.storage=256;
			pixel.size=6.7;
			
			System.out.println("pixel's model is "+pixel.model);
			System.out.println("*******************************");
			
			Phone samsung=new Phone();
			
			samsung.model="s22 Ultra"; 
			samsung.color="Black";
			samsung.storage=256;
			samsung.size=6.7;
			
			System.out.println("samsung color is "+samsung.color);
		 }
	}

}
