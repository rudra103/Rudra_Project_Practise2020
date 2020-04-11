package com.tasks;
import java.util.LinkedHashMap;
import java.util.Map;
public class NonRepeatedCharactersString {
	public static void main(String[] args) {
		String s="djklwqqertdaqmbxehtyd"; 
		char c[]=s.toCharArray();
		Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		System.out.println(map);
		for(char ch : c){
			if(map.containsKey(ch)){
				int count=map.get(ch);
				map.put(ch, count+1);
			}
			else {  
				map.put(ch, 1);
			}
		}
	   System.out.println(map);	
	   for(char ch : c){
		   if(map.get(ch)==1){
			   System.out.println("Non Repeated Character :: "+ch);
		   }
	   }
	}
}
