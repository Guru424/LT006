package corejava;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteText {

	public static void main(String[] args) throws IOException {
		
		FileWriter file=new FileWriter("D:\\LTO007.txt");
		BufferedWriter buff=new BufferedWriter(file);
		String text="Hello...Welcome to new world...";
		
		buff.write(text);
		buff.close();
	}
}
