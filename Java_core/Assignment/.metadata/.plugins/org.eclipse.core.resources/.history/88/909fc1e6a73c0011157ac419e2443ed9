package Programs;

class Grandparent{
	Grandparent(){
		System.out.println("Grandparent class constructor");
	}
	
	  static void display() { 
		  System.out.println("Grandparent static"); 
		  }
	   void show() { 
		   System.out.println("Grandparent non static"); 
		   }
	 
}
class parent extends Grandparent{
	parent(){
		System.out.println("parent class constructor");
	}
	
	  static void display() {
		  Grandparent.display(); 
		  System.out.println("parent static"); 
		  }
	  void show() {super.show();  System.out.println("parent non static"); }
	 
}
class child extends parent{
	child(){
		System.out.println("child class constructor");
	}
	static void display() {
		System.out.println("child static");
	}
	  void show() {
		  parent.display(); 
		  super.show(); 
		  System.out.println("child non static"); }
}

public class P15_Hierarchy {
public static void main(String[] args) {
	child obj=new child();
	child.display();
	obj.show();
	
}
}
