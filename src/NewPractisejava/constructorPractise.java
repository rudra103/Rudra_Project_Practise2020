package NewPractisejava;

public class constructorPractise {
    //Default Constructor
	public constructorPractise(){
		System.out.println("Default - Constructor..");
	}
	//Single Parametereter  Constructor
	public constructorPractise(int i){
		System.out.println("Value of i- "+i);
	}
	//two Parametereter's  Constructors
	public constructorPractise(int i,int j){
		System.out.println("Value of i- "+i);
		System.out.println("Value of j- "+j);
	}
	
	public static void main(String[] args) {

     constructorPractise obj=new constructorPractise();
     constructorPractise obj1=new constructorPractise(90);
     constructorPractise obj2=new constructorPractise(15,80);

     
     
	}

}
