package NewPractisejava;

public class reverseString {

	public static void main(String[] args) {

		String str=new String("Selenium Kama");
	    //System.out.println(str.length());
		String rev="";
		for(int i=str.length()-1;i>=0;i--){
			  rev=rev+str.charAt(i);
			}
		 System.out.println(rev);
		 
		 //String buffer - Mutable class-has rverse method.
		 StringBuffer str2=new StringBuffer("Mama jaffa");
	 
		 System.out.println(str2.reverse());
	}

}
