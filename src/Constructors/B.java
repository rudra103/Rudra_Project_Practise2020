package Constructors;

public class B extends A{

	public B(){
		System.out.println("Constructor - B ");
	}
	
	public B(int i){
		super(77);
		System.out.println("Constructor - Single parameter -B "+i);
	}
}
