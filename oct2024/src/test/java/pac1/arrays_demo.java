package pac1;

public class arrays_demo {
	int intnumbers[];
	
	arrays_demo(int i){
		intnumbers=new int[i];
	}
	void populatearray() {
		for(int i=0;i<intnumbers.length;i++) {
			intnumbers[i]=i+100;
		}
	}
	void display() {
		for(int i=0;i<intnumbers.length;i++) {
			System.out.println("Number"+i+":"+intnumbers[i]);
		}
	}
	public static void main(String args[]) {
		arrays_demo obj = new arrays_demo(10);
		obj.display();
		obj.populatearray();
		obj.display();
		
	}
	

}
