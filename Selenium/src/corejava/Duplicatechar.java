package corejava;

public class Duplicatechar {
public static void main(String[] args) {
	
	String str="Welcome Guruprakash";
	
	char[] chaArray=str.toCharArray();
	
	for(int i=0;i<str.length();i++){
		
		for(int j=i+1;j<str.length();j++){
			
			if(chaArray[i]==chaArray[j]){
				System.out.println(chaArray[j]);
			}
		}
	}
	
	
	
}
}
