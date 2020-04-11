package com.tasks;

import java.util.LinkedHashMap;
//Non Repeated Characters
import java.util.Map;
public class NonRepeatedFirstCharactersString {
	public static void main(String[] args) {
		String s = "11152811433774547893";
	    Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
	    System.out.println("Before :: "+map.entrySet());
	    char c[] = s.toCharArray();
	 
	       for (char ch : c) {
	           if (map.containsKey(ch)) {
	               int count = map.get(ch);
	               map.put(ch, count + 1);
	           } else {
	               map.put(ch, 1);
	       }
	   }
      System.out.println("After :: "+map.entrySet());
	       
	  for(char ch : c){
		  if (map.get(ch) == 1) {
              System.out.println("First-Non repeated characters in String "+ch);
              break;
         }
	}
  }
}
	
