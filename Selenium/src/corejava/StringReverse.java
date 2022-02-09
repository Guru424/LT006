package corejava;

public class StringReverse {
public static void main(String[] args) {
	
	String str="welcome";
	
	/*String reverse=new StringBuffer(str).reverse().toString();
	System.out.println(reverse);*/
	
	
	char[] chastr=str.toCharArray();
	for(int i=chastr.length-1;i>=0;i--){
		System.out.print(chastr[i]);
	}
	
}
}
