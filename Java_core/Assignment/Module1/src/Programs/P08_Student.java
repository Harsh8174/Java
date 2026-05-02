package Programs;

public class P08_Student {
   String name;
   int age;

   void display() {
	   System.out.println("Name :"+name+","+"Age :"+age);
   } 

   public static void main(String[] args) {
	    P08_Student s1=new P08_Student();
	    s1.name="Andrew Anderson";
	    s1.age=54;
	    s1.display();
}
   
}
