package NewPractisejava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class listExample {
    // List - Insertion order preserved,Duplicates allowed,Null insertion possible
	public static void main(String[] args) {
	
		List list=new ArrayList<>();
		list.add(60);
		list.add("Rudra");
		list.add(20.5);
		list.add(null);
		list.add(60);
		list.add(null);
		list.remove(0);
		
		System.out.println(list);
		Iterator ite=list.iterator();
		
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
	}

}
