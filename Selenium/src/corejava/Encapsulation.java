package corejava;

public class Encapsulation {

	private String name;
	public void setName(String name){
		
		this.name=name;
	}
	
	public String getName(){
		
		return name;
	}
	
	public static void main(String[] args) {
		
		Encapsulation enca=new Encapsulation();
		enca.setName("Guru");
		
		System.out.println(enca.getName());
	}
}
