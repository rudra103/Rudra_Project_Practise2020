package NewPractisejava;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class dupElemStringArray {

	public static void main(String[] args) {
		
		String names[]={"java","mava","java","python","is","python","is","jaffa"};
		System.out.println("Using normal comparision...");
		//time complexity is more
        for(int i=0;i<names.length;i++){
        	for(int j=i+1;j<names.length;j++){
        		if(names[i].equals(names[j])){
        			System.out.println("Duplicate Element in an array is : "+names[i]);
        		}
        	}
        }
	   //**********HashSet
		System.out.println("Using HashSet");
        Set<String> set=new HashSet<String>();
        for(String name : names ){
        	if(set.add(name)== false){
        		System.out.println("Duplicate element in an Array : "+name);
        	}
        }
		 //**********HashMap
		System.out.println("Using HashMap");
		Map<String,Integer> map=new HashMap<String,Integer>();
		for(String name : names){
			if(map.containsKey(name)){
				map.put(name, map.get(name)+1);
			}
			else
			{
				
				map.put(name, 1);
			}
		}
		System.out.println(map);
		Set<String> set2=map.keySet();
		for(String name : set2){
		     if(map.get(name) > 1){
		    	 System.out.println(name+" :  "+map.get(name));
		     }
		}
	}

}
