package Class11;

public class Person {
	String name;
	int age;
	double weight;
	double isfunny;
	double height;
	boolean losinghairs;
	
	void study() {
		if(name.equals("sam")) {
			System.out.println("I studay very hard ");
		}else if (name.equals("anna")){
			System.out.println("I will keep on deleting the messages and will not let any one study ");
		}else {
			System.out.println("i try to study but things don't make much sense ");
		}
	}
	public static void main(String[]args) {
		Person person1=new Person();
		person1.name="sam";
		person1.study();
		System.out.println("*******************");
		
	}  

}
