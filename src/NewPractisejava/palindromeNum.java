package NewPractisejava;

public class palindromeNum {

	public static void main(String[] args) {
      int num=123;
      int rev=0,r;
      
      while(num!=0){
    	  r=num%10;
    	  rev=rev*10+r;
    	  num=num/10;
      }
        System.out.println(rev);
	}

}
