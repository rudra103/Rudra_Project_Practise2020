package NewPractisejava;

public class reversenumber {

	public static void ispalin(int n){
		int rev=0,rem,temp;
		temp=n;
		while(n!=0){
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		
		if(temp==rev){
			System.out.println("Given Num is Palindrome :"+rev);
		}
		else{
			System.out.println("Not a palindrome :"+rev);
		}
	}
	
	public static void main(String[] args) {
      ispalin(123);
	}

}
