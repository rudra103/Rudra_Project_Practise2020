package NewPractisejava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class hashSetExample {

	public static void main(String[] args) {

		// List - Insertion order NOT preserved,Duplicates not allowed,Null insertion possible only once
		HashSet set=new HashSet<>();
		set.add(60);
		set.add("Rudra");
		set.add(20.5);
		set.add(null);
		set.add("Rudra");
		set.add(null);
		
		
		System.out.println(set);
		System.out.println(set.add(null));
		Iterator ite=set.iterator();
		
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
	}

	}


