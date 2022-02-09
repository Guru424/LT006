package corejava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
public static void main(String[] args) throws IOException {
	
	FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\src\\corejava\\LoginDetails.properties");
	
	Properties prop=new Properties();
	
	prop.load(file);
	
	System.out.println(prop.get("url") + " "+prop.get("name") +" " +prop.get("password"));
}
}
