package corejava;

public class TryCatch {
public static void main(String[] args) {
	
	try{
	int arr[]=new int[5];
	System.out.println(arr[5]);
	
	}catch(Exception var){
		System.out.println(var);
	}
	
	System.out.println("After...");
}
}
