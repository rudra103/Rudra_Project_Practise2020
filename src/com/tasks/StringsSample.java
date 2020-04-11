package com.tasks;

public class StringsSample {

	public static void main(String[] args) {
		
		String str="Selenium";
		
		String []list=str.split(" ");
		
		int size=list.length;
		
		char []c=str.toCharArray();
		for(char ch : c){
			System.out.println(ch);
		}
	}

}
