package Programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class P41_Hashmap {
          public static void main(String[] args) {
			HashMap obj=new HashMap();
			obj.put("1", "Andrew Anderson");
			obj.put(2, "Peter Parker");
			obj.put(8, "Jack Jackson");
			obj.put(55, "null");
			System.out.println(obj);
			Set obj1= obj.entrySet();
			System.out.println(obj1);
			
			Iterator itr1= obj1.iterator();
			while(itr1.hasNext()) {
				System.out.println(itr1.next());
			}
			//To read key and string individually
			
			Iterator itr2= obj1.iterator();
			while(itr2.hasNext()) {
				Map.Entry mpr= (Map.Entry) itr2.next();
				//System.out.println(mpr);
				System.out.println("Key :"+mpr.getKey());
				System.out.println("Value :"+mpr.getValue());
			}
		}
}
