package corejava;

public class TryFinally {
public static void main(String[] args) {
	
	try{
		
		int x=50/1;
		System.out.println(x);
	}finally{
		System.out.println("This is finally block...");
	}
}
}
