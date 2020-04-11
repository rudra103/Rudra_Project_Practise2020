package Constructors;

public class C extends B{

	public C(int i){
		
		System.out.println("Constructor Sigle parameter - C "+i);
	}
	
	public C(){
		super(88);
		System.out.println("Constructor - C - Default ");
	}
	
	public static void main(String[] args) {
		
		C obj=new C(99);
		
		
	}

}
