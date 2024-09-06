package propertiesDemo;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;


public class PropertiesDemo 
{
	public static void main(String[] args) throws Exception 

	{
		Properties p=new Properties();
		
		//to load properties from properties file into java properties object
		FileInputStream f=new FileInputStream("properties\\abc.properties");
		p.load(f);
		System.out.println(p);
		
		//to get value associated with the specified property;
		String ps=p.getProperty("userName");
		System.out.println(ps);
		
		//to set new property
		p.setProperty("userName", "Rohit");
		System.out.println(p);
		
		//to store properties from java properties object into java properties file
		FileOutputStream fo= new FileOutputStream("properties\\abc.properties");
		p.store(fo, "Hello I am Sagar");
		System.out.println("Stored Sucessfully");

	}

}
