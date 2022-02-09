package corejava;

class Overrid{
	public void bike(){
		System.out.println("My bike name is herohonda...");
	}
}
public class Overriding extends Overrid{

	
	public void bike(){
		System.out.println("My bike name is KTM...");
	}
	
	public static void main(String[] args) {
		
		Overrid over=new Overriding();
		over.bike();
		
	}
}
