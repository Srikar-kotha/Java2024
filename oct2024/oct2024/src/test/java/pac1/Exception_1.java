package pac1;

public class Exception_1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
			String str=null;
			str.equals("hello");
			System.out.println("this is try bloack");
			
			int a=0;
			int b=30/a;
		}
		catch(NullPointerException ex){
			
			System.out.println(ex.getMessage());	
			System.out.println("this is catch1");
		}
		catch(ArithmeticException ex) {
			System.out.println(ex.getMessage());
			System.out.println("this is catch2");
			
		}
	}

}
