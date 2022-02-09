package corejava;

import java.util.PriorityQueue;

public class PriorityQueueEx {
public static void main(String[] args) {
	
	PriorityQueue<String> que=new PriorityQueue<>();
	que.add("Sri");
	que.add("Guru");
	que.add("Anu");
	que.add("Rama");
	
	System.out.println(que.peek());
	System.out.println(que.element());
	
	for(String var:que){
		System.out.println(var);
	}
	
	que.remove();
	que.poll();
	
	System.out.println("After remove....");
	
	for(String var1:que){
		System.out.println(var1);
	}
}
}
