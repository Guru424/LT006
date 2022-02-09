package sikuli;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class DesktopTest {
public static void main(String[] args) throws FindFailed {
	
	Screen sc=new Screen();
	Pattern  pt=new Pattern("D:\\Capture.PNG");
	
	sc.doubleClick(pt);
}
}
