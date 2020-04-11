package NewPractisejava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class mapExample2 {

	public static void main(String[] args) {
// Map - Insertion order NOT preserved,Duplicates : key-unique, allowed-values,
//Null insertion possible one time - Key,
		Map map=new HashMap();
		
		map.put(1, "Rudra");
		map.put(2, "Jaffa");
		map.put(3, "Sheik");
		map.put(3, "Raja");
		map.put("Jaffa", 999);
		map.put(null, 900.6369);
		map.put(null, "abc");
		
        System.out.println(map);
        //Using Iterations - Map
        
        Iterator<Map.Entry<Object,Object>> itr=map.entrySet().iterator();
        
        while(itr.hasNext()){
        	Map.Entry<Object,Object> entry=itr.next();
        	System.out.println("Key,Value : "+entry.getKey()+","+entry.getValue());
        	
        }
   
	}

}
