package inheritance;

public class AudiCar extends Car 
{
   //Overriding : process of redefining method of SuperClass(Car) in subClass (AudiCar) with same signature.
	
	public void start(){
		System.out.println("Audi start..");
	}
	
	public void stop(){
		System.out.println("Audi stop..");
	}
	
	public void auditankSize(){
		System.out.println("auditankSize ..");
	}
	public void cartankSize(){
		System.out.println("AUDI car tankSize ..");
	}
	public void audiFuel(){
		System.out.println("Fuel  with AUDI CAR");
	}
}
