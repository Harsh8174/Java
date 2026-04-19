package Programs;
class A{
	void display() {
		System.out.println("Parent 0 arg method");
	}
	void display(int i) {
		System.out.println("Parent 1 arg method  " + i);
	}
}
class B extends A{
	void display() {
		super.display();
		System.out.println("child 0 arg method");
	}
	void display(int i) {
		super.display(i);
		System.out.println("child 1 arg method" + i);
	}
}
public class P16_Methodoveriding {
            public static void main(String[] args) {
				B obj=new B();
				obj.display();
				obj.display(45);
			}
}
