package NewPractisejava;

public class encapsulationexample {

	private int empAge;
	private String empName;
	private int empSSN;
			
	public static void main(String[] args) {
		
		encapsulationexample emp=new encapsulationexample();
		emp.setEmpName("Tom Peter");
		emp.setEmpSSN(12456888);
		emp.setEmpAge(45);
		
		System.out.println(emp.getEmpName());
		System.out.println(emp.getEmpSSN());
		System.out.println(emp.getEmpAge());

	} 

	public int getEmpAge() {
		return empAge;
	}



	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}



	public String getEmpName() {
		return empName;
	}



	public void setEmpName(String empName) {
		this.empName = empName;
	}



	public int getEmpSSN() {
		return empSSN;
	}



	public void setEmpSSN(int empSSN) {
		this.empSSN = empSSN;
	}

}
