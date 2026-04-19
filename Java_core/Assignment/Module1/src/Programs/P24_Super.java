package Programs;

class Animal{
	Animal(String name){
		System.out.println("Animal :"+name);
	}
	void display(String Name) {
		System.out.println("Dog Name :"+Name);
	}
}
class Dog extends Animal{
	Dog(){
	super("Dog");
	super.display("Labrador");
	}
	}
public class P24_Super {
  public static void main(String[] args) {
	Dog obj=new Dog();
}
}
