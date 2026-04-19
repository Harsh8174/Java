package Programs;

class Student1{
	private String name;
 	private  int age;
	private  int id;
	
	void settername(String name) {
		   this.name=name;
	}
	void getname() {
		System.out.println("Student name  : "+name);
	}
	void setterage(int age) {
		   this.age=age;
	}
	void getage() {
		System.out.println("Student age  : "+age);
	}
	void setterid(int id) {
		   this.id=id;
	}
	void getid() {
		System.out.println("Student id  : "+id);
	}
	 
}


public class P10_Encapsulation {
  public static void main(String[] args) {
	Student1 s1=new Student1();
	s1.settername("Andrew Anderson");
	s1.setterid(450);
	s1.setterage(12);
	s1.getid();
	s1.getname();
	s1.getage();
}
}
