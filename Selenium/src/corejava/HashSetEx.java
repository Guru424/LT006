package corejava;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
public static void main(String[] args) {
	
	HashSet<String> set=new HashSet<>();
	
	set.add("Guru");
	set.add("Sri");
	set.add("Prakash");
	set.add("Guru");
	
	
	Iterator<String> itr=set.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
}
}
