package NewPractisejava;

public class StringContainsDigits {

	public static boolean isEmpty(CharSequence cs){
        return cs == null || cs.length() == 0;
	}

	public static boolean isnumeric(CharSequence cs){
		if(isEmpty(cs)){
			return false;	
		}
		
		for(int i=0;i<cs.length();i++){
			if(! Character.isDigit(cs.charAt(i))){
				return false;
			}
		  }
		
		return true;
	}
	
	public static void main(String[] args) {
		if(isnumeric("CBI")){
			System.out.println("String contains Numeric value..");
		}
		else{
			System.out.println("String don't have Numeric value");
		}
		System.out.println(isnumeric("0"));
		System.out.println(isnumeric("U123"));
		System.out.println(isnumeric("ab456"));
	}

}
