package Programs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable
{
   int 	id;
   String name;
   Student(int id,String name){
	   this.id=id;
	   this.name=name;
   }
   @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id :"+this.id+"Name : "+name;
	}
}

public class P38_SerializationandDeserialization {
   
	void serialization() throws IOException ,ClassNotFoundException{
		 Student s1=new Student(12,"Andrew Anderson");
		 ObjectOutputStream obj=new ObjectOutputStream(new FileOutputStream("Student.txt"));
         obj.writeObject(s1);
         obj.flush();
         obj.close();
	}
	 void deserialization() throws IOException, ClassNotFoundException{
		ObjectInputStream obj=new ObjectInputStream(new FileInputStream("Student.txt"));
	    int i;
	     Student s=(Student)obj.readObject();
	     System.out.println(s);
         obj.close();        	
	 }
	   public static void main(String[] args) {
		
		   P38_SerializationandDeserialization obj=new P38_SerializationandDeserialization();
		   try {
			   obj.serialization();
			   obj.deserialization();
		   }catch (Exception e) {
			// TODO: handle exception
			 System.out.println("Exception Handled");  
		}
		   
	}
}
