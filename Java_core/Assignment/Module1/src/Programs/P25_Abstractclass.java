package Programs;

abstract class Person{
	abstract void Eatting();
	abstract void Walking();
	Person(int id,String name){
		System.out.println("Abstratc construcotr");
	     this.id=id;
	     this.name=name;
	}
	int id;
	String name;
	void display() {
		System.out.println("id :"+this.id);
		System.out.println("name :"+this.name);
	}
   }

class Employee extends Person{
	    Employee(int id,String name){
	    	super(id,name);
	    }
	  void Eatting(){
		  System.out.println("Employee eating");
	  }
	  void Walking(){
		  System.out.println("Employee walking");
	  }
}



public class P25_Abstractclass {
public static void main(String[] args) {
	    Employee obj=new Employee(23,"Andrew Anderson");
        obj.Eatting();
        obj.Walking();
        obj.display();
        obj.id=45;
        obj.name="Peter parker";
        obj.display();
        
  }
	   
}
