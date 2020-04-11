package com.tasks;
public class StringVowelsConsonants2 {
	//Vowels and Consonants Count
	public static void main(String[] args) {
		String str="Selen333ium We567bDriver 789";
		str=str.toLowerCase();
		int vowels=0,conso=0,spaces=0,num=0;
		for(int i=0;i<str.length();i++){
		  char ch=str.charAt(i);
			if(ch=='a'||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u'){
			  vowels++;
			  System.out.println("Vowel :: "+ch);
		  }
			else if(ch>='a' && ch<='z'){
				conso++;
			}
			else if(ch>='0' && ch<='9'){
				num++;
			}
			else if(ch==' '){
				spaces++;  }
		}
	 System.out.println("    Vowels :: "+vowels);
	 System.out.println("Consonants :: "+conso);
	 System.out.println("    Digits :: "+num);
	 System.out.println("    Spaces :: "+spaces);
	}
}
