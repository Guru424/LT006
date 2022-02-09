package corejava;

abstract class Sample{
	
	public void test(){
		System.out.println("This is the Non-abstract method...");
	}
	
	abstract void test2();
}

public class AbstractEx extends Sample{
	{
}

	@Override
	void test2() {
		System.out.println("This is the abstract method...");
		
	}
	
	public static void main(String[] args) {
	
	Sample obj=new AbstractEx();
	obj.test();
	obj.test2();
	
	}
}
