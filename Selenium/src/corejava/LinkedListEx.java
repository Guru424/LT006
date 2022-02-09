package corejava;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		
		LinkedList<String> list=new LinkedList<String>();
		list.add("Guru");
		list.add("Rama");
		list.add("Vijay");
		list.add("Rama");
		
		
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
