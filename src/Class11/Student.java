package Class11;

public class Student {

	String name;
	String id;
	int age;
	double wieght;
	char gender;
	
	void study() {
		System.out.println("Student is studying");
	}
	void deletemessages() {
		System.out.println("Deleting message from Discord ");
	}
	void eat() {
		System.out.println("Eating pizza..........");
	}
	public static void main(String[]args) {
		//new student()=>creates the object of student class
		Student sonamObject=new Student();
		sonamObject.name="sonam";
		sonamObject.id="123";
		sonamObject.age=31;
		
		System.out.println(sonamObject.name);
		System.out.println(sonamObject.age);
		sonamObject.deletemessages();
		sonamObject.deletemessages();
		System.out.println("******************************");
		
		Student student2=new Student();
		student2.name="sam";
		student2.age=12;
		student2.wieght=34;
		student2.gender='F';
		
		System.out.println( student2.name );
		student2.eat();
		
		
	}




	}


