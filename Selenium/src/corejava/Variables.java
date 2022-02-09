package corejava;

public class Variables {
    int i=200;
    static int ii=300;
	public void variable1(){
		int i=100;
		System.out.println(i);
	}
	
    public void variable2(){
		System.out.println(i);
	}
    public static void main(String[] args) {
		
    	System.out.println(ii);
    	Variables var=new Variables();
    	var.variable1();
    	var.variable2();
	}
}
