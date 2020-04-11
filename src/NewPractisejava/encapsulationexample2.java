package NewPractisejava;

public class encapsulationexample2 extends  encapsulationexample
{

	public static void main(String[] args) {
		
		encapsulationexample2 emp2=new encapsulationexample2();
		emp2.setEmpName("Petre Hien'ss");
		emp2.setEmpSSN(5865236);
		emp2.setEmpAge(60);
		
		System.out.println(emp2.getEmpAge());
		System.out.println(emp2.getEmpSSN());
		System.out.println(emp2.getEmpName());
	} 

}
