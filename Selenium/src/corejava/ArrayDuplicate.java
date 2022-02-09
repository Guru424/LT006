package corejava;

public class ArrayDuplicate {
public static void main(String[] args) {
	
	int arr[]={10,30,45,23,43,30,10,45,67,21,67};
	
	for(int i=0;i<arr.length;i++){
		for(int j=i+1;j<arr.length;j++){
			
			if(arr[i]==arr[j]){
			System.out.println(arr[j]);
			}
		}
	}

int arr[]={10,30,45,23,43,30,10,45,67,21,67};
	
	for(int i=0;i<arr.length;i++){
		for(int j=i+1;j<arr.length;j++){
			
			if(arr[i]==arr[j]){
			System.out.println(arr[j]);
			}
		}
	}
}
}
