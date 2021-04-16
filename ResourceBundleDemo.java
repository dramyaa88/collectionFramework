package demo.utility;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleDemo {
	
	public static void main(String[] args) {
		
		ResourceBundle r = ResourceBundle.getBundle("test.properties", Locale.ENGLISH) ;
		String uid = r.getString("userId");
		String pwd = r.getString("password");
		
		if(uid.equals("admin") && (pwd.equals("admin")))
		{
			
		}
		
	}

}
