package NewPractisejava;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountDuplicateWordsString {

	public static void findDupwordsCount(String inputString){
		String words[]=inputString.split(" ");
	    Map<String, Integer> wordCount=new HashMap<String, Integer>();
	    //to check each word in array
	    for(String word : words){
	    	
	    	//if word is present
	    	if(wordCount.containsKey(word)){
	    		wordCount.put(word.toLowerCase(), wordCount.get(word)+1);
	    	}
	    	else{
	    		wordCount.put(word.toLowerCase(), 1);
	    	}
	    }
	    System.out.println(wordCount);
	    //extracting keys of MAP - wordCount
	    Set<String> wordsStr=wordCount.keySet();
	    for(String word : wordsStr ){
	    	if(wordCount.get(word) == 1){
	    		System.out.println(word+" : "+wordCount.get(word));
	    	}
	    }  
	}
		
	public static void main(String[] args) {
		
		findDupwordsCount("Mava is kama is mava kama is are");
	}

}
