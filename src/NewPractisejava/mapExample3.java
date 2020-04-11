package NewPractisejava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class mapExample3 {

	public static void main(String[] args) {
// Map - Insertion order NOT preserved,Duplicates : key-unique, allowed-values,
//Null insertion possible one time - Key,
		Map<Object,Object> map=new HashMap<Object,Object>();
		map.put(1, "Rudra");
		map.put(2, "Jaffa");
		map.put(3, "Sheik");
		map.put(3, "Raja");
		map.put(null,"Saala");
		
	    System.out.println(map); 
		
        for(Object i : map.keySet()){
        	
        	System.out.println(i+","+map.get(i));
        	
        }
		
	}
}
