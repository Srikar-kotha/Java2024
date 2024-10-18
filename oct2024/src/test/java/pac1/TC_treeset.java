package pac1;

import java.util.TreeSet;

public class TC_treeset {
	
	public static void main(String[] args) {
		
		TreeSet<String> t1=new TreeSet<String>();
		
		t1.add("One");
		t1.add("two");
		t1.add("three");
		t1.add("four");
		
		for (String index:t1) {
			
			System.out.println(index);
		}
		
		System.out.println(t1);
	}

}
