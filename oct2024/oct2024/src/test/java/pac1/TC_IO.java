package pac1;

public class TC_IO 
{
	
	public static void main(String[] args) 
	{
		
		StringBuffer sb =  new StringBuffer();
		char c;
		System.out.println("enter a string");
		try {
			while((c=(char)System.in.read())!='\n') 
			{
				sb.append(c);
				
			}
		}
		catch(Exception e) {
			System.out.println("The error is that : "+e.getMessage());
			
		}
		String s = new String(sb);
		System.out.println("you entered :"+s);
		
	}

}
