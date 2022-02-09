package corejava;

public class Print1to100 {

	public static void main(String[] args) {
		int number=1;
			printNum(number);
	}
	
	public static void printNum(int num){
		if(num<=100){
			System.out.println(num +" ");
			printNum(num+1);
		}
	}
}
