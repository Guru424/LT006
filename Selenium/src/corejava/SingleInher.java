package corejava;

class Single{
	
	public void test(){
		System.out.println("This is the super class method");
	}
}

public class SingleInher extends Single {

	public void test2(){
		System.out.println("This is the sub class method");
	}
	
	public static void main(String[] args) {
		
		SingleInher obj=new SingleInher();
		obj.test2();
		obj.test();
		
	}
}
