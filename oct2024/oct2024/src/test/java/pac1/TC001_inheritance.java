package pac1;

class base{
	public void basemethod() {
		System.out.println("This is the base class");
	}

}

class derived extends base{
	public void derivemethod() {
		
		super.basemethod();
		System.out.println("This is the derived class");
	}
	
}

public class TC001_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		derived obj = new derived();
		obj.basemethod();
		obj.derivemethod();

	}

}
