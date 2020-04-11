package com.tasks;
//Character Occuence Of a String
public class StringOccurenceCharacter {
	public static void main(String[] args) {
		String str="Selenium WebDrivers";
		int freq=0;
		char c='S';
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch=='S'|| ch=='s'){
				freq++;
			}
		}
		 System.out.println("Occurence Of a character "+c+" in a String:: "+freq);
	}
}
