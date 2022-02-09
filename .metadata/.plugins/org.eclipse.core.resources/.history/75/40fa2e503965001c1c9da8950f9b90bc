package corejava;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderText {
public static void main(String[] args) throws IOException {
	
	//FileReader file=new FileReader("D:\\FileReader.txt");
	
	//FileReader file=new FileReader(System.getProperty("user.dir")+"\\src\\corejava\\FileReader.txt");
	
	FileReader file=new FileReader(".\\Files\\FileReader.txt");
	BufferedReader buff=new BufferedReader(file);
	
	String text=null;
	while((text=buff.readLine())!=null){
		System.out.println(text);
	}
	
}
}
