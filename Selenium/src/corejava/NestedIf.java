package corejava;

public class NestedIf {
public static void main(String[] args) {
	
	
	int x=10;
	int y=20;
	if(x<100){
		if(y<200){
			System.out.println("This is the nested if statement...");
		}
	}
	
	System.out.println("This is the out side the nested if statement...");
}
}
