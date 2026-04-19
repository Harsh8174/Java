package Programs;

interface Dog1{
	void run();
}
interface cat{
	void run();
}
interface horse{
	void run();
}

class Animal1 implements Dog1,cat,horse{

   public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running method called");
	}
   
}
public class P26_MutliclassInterface {
public static void main(String[] args) {
	Animal1 obj=new Animal1();
	obj.run();
}
	
}
