package pac1;

public class TC001_Variable {
	
	
	private static double dblwidth=20;
	private static double dblheight=30;
	private static double dbldepth=40;
	private static int boxid;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calvolume();
		
	}
	
	public static double calvolume()
	{
		double doutemp;
		doutemp = dblwidth * dblheight * dbldepth;
		System.out.println(doutemp);
		return doutemp;
		

		
	}

}