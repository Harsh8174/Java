package Programs;

class Parent1 {
	
	Parent1(){
		System.out.println("Parent class constructor");
	}
	void Parent_meth() {
		System.out.println("Parent class method");
	}
}
class child1 extends Parent1{
	child1(){
		System.out.println("child class constructor");
	}
	void child_meth() {
		System.out.println("child class method");
	}
}

public class P14_singleinheritance {
public static void main(String[] args) {
	System.out.println("Program demonstrating single leve inheritance");
	child1 obj=new child1();
	obj.Parent_meth();
	obj.child_meth();
}
	
}
