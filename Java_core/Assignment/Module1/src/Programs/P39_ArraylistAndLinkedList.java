package Programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class P39_ArraylistAndLinkedList {
public static void main(String[] args) {
	 ArrayList obj1=new ArrayList();
    obj1.add("Andrew Anderson");
    obj1.add("Peter Parker");
    obj1.add(45);
    obj1.add(71);
    System.out.println(obj1);
    obj1.remove(0);
    System.out.println(obj1);
    Iterator itr= obj1.iterator();
    while(itr.hasNext()) {
    	System.out.println(itr.next());
    	//System.out.println(itr.next().getClass().getName());
    }
    
      LinkedList obj2=new LinkedList();
      obj2.add("Jack Jackson");
      obj2.add("Andrew Anderson");
      obj2.add(41);
      obj2.add(78);
      System.out.println(obj2);
      Iterator itr1= obj2.iterator();
      while(itr1.hasNext()) {
      	System.out.println(itr1.next());
      	//System.out.println(itr.next().getClass().getName());
      }
}
	     
	      
	
}
