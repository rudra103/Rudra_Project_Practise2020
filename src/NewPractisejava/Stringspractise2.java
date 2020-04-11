package NewPractisejava;

public class Stringspractise2 {
	public static void main(String[] args) {
   		String s1=new String("Rudra mama");
   		//System.out.println(s1.length());
   		System.out.println(s1.indexOf('a'));
   		System.out.println(s1.indexOf('a', s1.indexOf('a')+1));
   		String s2="  Hello World  ";
   		System.out.println(s1.indexOf("mama"));
   		System.out.println(s1.indexOf("jaffa"));
   		System.out.println(s1.substring(1, 7));
   		System.out.println(s2.trim());
   		System.out.println(s2.replace(" ", ""));
   		String s3="hello_Jaffa_how_are_you";
   		String str2[]=s3.split("_");
   		for(int i=0;i<str2.length;i++){
   			System.out.println(str2[i]);
   		}
		
	}
}
