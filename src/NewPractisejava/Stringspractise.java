package NewPractisejava;

public class Stringspractise {
	public static void main(String[] args) {
   		String s1=new String("Rudra");
   		System.out.println(s1.length());
		String s2=new String("kishore");
        System.out.println(s1+" "+s2);
        String s3=s1.concat(" jaswanth");
        System.out.println(s3);
        String s4="Venky mama";
        System.out.println(s4.substring(2,4));
        System.out.println(s4.replace("a", "Jaffa"));
        String s5="World is suffering with corona";
        String str[]=s5.split(" ");
        System.out.println(str.length);
        for(int i=0;i<str.length;i++){
        	System.out.println(str[i]);
        	if(str[i].equals("with")){
        		System.out.println("found with ..");
        		break;
        	}
        }
      
        String s6="Dhoni mahi";
        for(int i=0;i<s6.length();i++){
           System.out.println(s6.charAt(i));
        }
	}
}
