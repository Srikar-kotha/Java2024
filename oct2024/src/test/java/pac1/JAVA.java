package pac1;

import Guddu.*;
import java.lang.Math.*;
import java.util.Random;
 
public class JAVA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		System.out.println("Hello world1");
		System.out.println("Hello world1");
		System.out.println("Hello world1");
		System.out.println("The square root of 9 is "+Math.sqrt(9));
		
		Guddu.student.main(args);
		Guddu.course.main(args);
		Guddu.teacher.main(args);
		Random random = new Random();
		long a=1000000000L+(long)(random.nextDouble()*9000000000L);
		System.out.println(a);
        
	}

}
