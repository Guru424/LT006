package corejava;

interface Sample1{
	
	abstract void simple();
	
	default void test(){
		System.out.println("Default method in the interface");
	}
}


public class InterfaceEx implements Sample1{

	@Override
	public void simple() {
		System.out.println("Abstract methodin the interface");
		
	}

	
	public static void main(String[] args) {
		
		Sample1 obj=new InterfaceEx();
		obj.simple();
		obj.test();
	}
}
