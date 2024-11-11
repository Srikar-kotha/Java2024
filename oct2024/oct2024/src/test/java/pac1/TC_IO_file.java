package pac1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TC_IO_file 
{
	
	FileInputStream fromfile;
	FileOutputStream tofile;
	
	public void init(String source,String dest) 
	{
		try {
			fromfile=new FileInputStream(source);
			tofile=new FileOutputStream(dest);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void copycontents()
	{
		try {
			int i = fromfile.read();
			
		    while(i!=1)
		    {
		    	tofile.write(i);
		    	i=fromfile.read();
			}
		    }
		catch(IOException ioe)
		{
			System.out.println(ioe.getMessage());
			
		}
	}
	
	public void closefile() {
		try {
			fromfile.close();
			tofile.close();
		}catch(IOException ioe) {
			System.out.println("message :"+ioe.getMessage());
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String sourcefile="sourcefile.txt";
		String destfile = "Destfile.txt";
		TC_IO_file obj = new TC_IO_file();
		obj.init(sourcefile, destfile);
		

	}

}
