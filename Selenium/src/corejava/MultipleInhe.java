package corejava;

interface Interface1{
	abstract void inter1();
}

interface Interface2{
	abstract void inter2();
}

public class MultipleInhe implements Interface1,Interface2{
	

@Override
public void inter2() {
	System.out.println("Second interface method...");
	
}

@Override
public void inter1() {
	System.out.println("First interface method...");
	
}

public static void main(String[] args) {
	
	
	MultipleInhe obj=new MultipleInhe();
	obj.inter1();
	obj.inter2();
}
}
