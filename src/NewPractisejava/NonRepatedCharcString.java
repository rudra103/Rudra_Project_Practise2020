package NewPractisejava;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NonRepatedCharcString {

	public static void nonCharString(String inputString){
		
		char ch[]=inputString.toCharArray();
		
		Map<Character, Integer> charMap=new HashMap<Character, Integer>();
		
		for(char c : ch)
		{	
		   if(charMap.containsKey(c)){
          	    charMap.put(c,charMap.get(c)+1);
     	       }
		   else {
			   charMap.put(c, 1);
		   }
		}
		System.out.println(charMap);
		//extracting all the values in Map - charMap
		Set<Character> ch2=charMap.keySet();
			      for(char c : ch2){
		   if(charMap.get(c)>1){
			   System.out.println(c+" : "+charMap.get(c));
		   }
		}
	}
		
	public static void main(String[] args) {
		nonCharString("jjkkklmmngg");
		
	}

}
