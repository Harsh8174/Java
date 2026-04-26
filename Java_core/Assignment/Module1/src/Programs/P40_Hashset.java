package Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class P40_Hashset {
   public static void main(String[] args) {
	  ArrayList<Integer> obj=new ArrayList<Integer>();
	  obj.add(41);
	  obj.add(12);
	  obj.add(56);
	  obj.add(78);
	  obj.add(98);
	  obj.add(12);
	  Collections.sort(obj);
	  System.out.println(obj);
	  
	  HashSet<Integer> obj1=new HashSet<Integer>(obj);
	  System.out.println(obj1);
}
}
