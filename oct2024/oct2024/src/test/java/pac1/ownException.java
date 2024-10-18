package pac1;

import java.io.FileNotFoundException;

public class ownException {
	
	void proc()
	{
		try {
			throw new FileNotFoundException("From exception");
		}catch(FileNotFoundException e) {
			System.out.println("caught the exception in demo");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ownException obj = new ownException();
		obj.

	}

}
