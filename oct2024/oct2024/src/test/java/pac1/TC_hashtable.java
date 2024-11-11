package pac1;

import java.util.Hashtable;

public class TC_hashtable {
	
	public static void main(String[] args) {
		
		Hashtable<String,Double> ht= new Hashtable<String,Double>();
		
		ht.put("Arun",35.5);
		ht.put("kiran", 45.00);
		ht.put("Sweshik", 03.09);
		
		System.out.println(ht);
		
		System.out.println(ht.keySet());
		
		System.out.println(ht.values());
	}

}
