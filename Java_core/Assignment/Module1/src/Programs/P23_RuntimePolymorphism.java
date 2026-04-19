package Programs;

class Class{
	void display(int id,String name) {
		System.out.println("Student_id :"+id);
		System.out.println("Studnet_name :"+name);
	}
}
class Studentclass extends Class{
	@Override
	void display(int id, String name) {
		// TODO Auto-generated method stub
		//super.display(id, name);
		System.out.println("Student_id :"+id);
		System.out.println("Studnet_name :"+name);
	}
}

public class P23_RuntimePolymorphism {
public static void main(String[] args) {
	Class obj=new Studentclass();
	obj.display(12, "Andrew Anderson");
	obj=new Studentclass();
	obj.display(14, "peter parker");
}
}
