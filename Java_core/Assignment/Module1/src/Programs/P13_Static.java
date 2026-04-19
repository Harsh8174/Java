package Programs;

public class P13_Static {
	static String name;
	static int age;
	
	static void display() {
		System.out.println("Static method");
		System.out.println(name);
		System.out.println(age);
	}
public static void main(String[] args) {
	//do not require to create object
	P13_Static.name="Andrew Anderson";
	P13_Static.age=45;
	P13_Static.display();
	P13_Static.name="Peter Parker";
	P13_Static.age=41;
	P13_Static.display();
	
}
}
