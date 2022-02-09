package corejava;

import java.util.ArrayDeque;

public class ArrayDequeEx {
public static void main(String[] args) {
	
	ArrayDeque<String> deq=new ArrayDeque<>();
	deq.add("Guru");
	deq.add("Rama");
	
	deq.addFirst("Sri");
	deq.addLast("Anu");
	
	for(String var:deq){
		System.out.println(var);
	}
}
}
