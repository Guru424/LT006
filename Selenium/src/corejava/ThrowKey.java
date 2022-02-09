package corejava;

public class ThrowKey {
	
	static void validate(int age){
		if(age<18){
			//System.out.println("Eligeble for vote...");
			throw new ArithmeticException("Eligeble for vote...");
		}else{
			System.out.println("Not eligble for vote...");
		}
	}
public static void main(String[] args) {
	
	validate(15);
}
}
