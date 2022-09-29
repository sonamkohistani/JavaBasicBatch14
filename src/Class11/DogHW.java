package Class11;

public class DogHW {
	String name;
	String color;
	String breed;
	String gender;
	double weight;
	int age;
	int size;
	
	void bark() {
		System.out.println();
	}
	void sleep() {
		System.out.println("Dog is sleeping");
	}
	public static void main(String[]args) {
	
		Dog Huskey= new Dog();
		Huskey.name="Baby";
		Huskey.color="Black&White";
		Huskey.name="Rex";
		Huskey.age=4;
		Huskey.weight=90;
		Huskey.sleep();
		
		System.out.println("********************");
		
		Dog Bulldog=new Dog();
		Bulldog.name="Lexi";
		Bulldog.color="Yellow";
		Bulldog.weight=40;
		Bulldog.age=6;
	
		System.out.println("Bulldog weight is "+Bulldog.weight);
		System.out.println("Bulldog weight is "+Bulldog.color);
		System.out.println("***************************");
		
		Dog Labrador=new Dog();
		Labrador.color="Black";
		Labrador.age=6;
		Labrador.breed="Labrador";
		Labrador.name="Max";
		Labrador.weight=40;
		System.out.println("Labrador name is "+Labrador.name+ " and color  is "+Labrador.color);
		

}}
