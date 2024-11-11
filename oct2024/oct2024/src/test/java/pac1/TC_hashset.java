package pac1;

import java.util.HashSet;

public class TC_hashset {
	
	public static void main(String[] args) {
	
		HashSet<Integer> s1 = new HashSet<Integer>();
		
		s1.add(100);
		s1.add(10000);
		s1.add(10);
		s1.add(100000);
		
		System.out.println("size :"+s1.size());
		for(Integer index:s1)
		{
			System.out.println(index+"");
		}
		
		HashSet<String> s2=new HashSet<String>();
		
		s2.add("apple");
		s2.add("banana");
		s2.add("grapes");
		s2.add("Orange");
		
		for(String index:s2)
		{
			System.out.println(index+"");
		}
		
	}

}
