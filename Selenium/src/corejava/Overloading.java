package corejava;

public class Overloading {
	
	public void mobile(String name){
		System.out.println("My mobile name is ="+name);
	}
	
    public void mobile(int price){
		System.out.println("My mobile price is ="+price);
	}
	
public static void main(String[] args) {
	
	Overloading over=new Overloading();
	over.mobile("Sony");
	over.mobile(50000);
}
}
