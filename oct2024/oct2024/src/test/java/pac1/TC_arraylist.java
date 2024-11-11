package pac1;

import java.util.ArrayList;

public class TC_arraylist {
	
	
	public static void main(String[] args) {
	
		ArrayList<String> l1=new ArrayList<String>();
		l1.add("hello");
		l1.add("world");
		l1.add("Apple");
		l1.add("Orange");
		
		System.out.println("size;"+l1.size());
		
		System.out.println(l1.contains("world"));
		
		System.out.println(l1.get(2));
		
		System.out.println(l1.remove(3));
		
		System.out.println("size :"+l1.size());
		
		System.out.println(l1);
		
		System.out.println(l1.removeAll(l1));
		
		System.out.println(l1);
		
		
	}
}
