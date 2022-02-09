package corejava;

public class ArrayMaxMin {

	public static void main(String[] args) {
		
		int arr[]={12,103,112,56,78,345,786,8,34,2};
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++){
			
			if(arr[i]>max){
				max=arr[i];
			}
			
			if(arr[i]<min){
				min=arr[i];
			}
		}
		
		System.out.println("Max value in the array ="+max);
		System.out.println("Min value in the array ="+min);
	}
}
