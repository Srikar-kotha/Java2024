package pac1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TC_hashmap {
	
	public static void main(String[] args) {
		
		HashMap<String,String> m1=new HashMap<String,String>();
		
		m1.put("1001", "srikar");
		m1.put("1002", "sweshik");
		m1.put("1003", "Ashwik");
		m1.put("1004", "Guddu");
		
		System.out.println(m1);
		
		System.out.println(m1.get("1002"));
		
		System.out.println(m1.values());
		
		System.out.println(m1.keySet());
		
		Set s1=m1.entrySet();
		
		Iterator i=s1.iterator();
		
		while(i.hasNext()) {
			Map.Entry me=(Map.Entry)i.next();
			
			System.out.println(me.getKey()+":"+me.getValue());
		}
		
	}

}
