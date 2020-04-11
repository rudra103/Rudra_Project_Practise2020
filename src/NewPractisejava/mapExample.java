package NewPractisejava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class mapExample {

	public static void main(String[] args) {
// Map - Insertion order NOT preserved,Duplicates : key-unique, allowed-values,
//Null insertion possible one time - Key,
		Map map=new HashMap();
		
		map.put(1, "Rudra");
		map.put(2, 60);
		map.put(3, 20.696);
		map.put(3, "Raja");
		map.put(null, 990);
		map.put(null, "jaffa");
		map.put(5, 78.59865);
		map.put("hari", 789);
        System.out.println(map);
         
       for(Object i : map.keySet()){
    	   System.out.println("Key - "+i);
       }
       for(Object val : map.values()){
    	   System.out.println("Value - "+val);
       }

	}

}
