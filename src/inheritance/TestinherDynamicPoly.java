package inheritance;

public class TestinherDynamicPoly extends AudiCar 
{

	public static void main(String[] args) {
		//Sub class object is created with Super class reference. to achieve Dynamic Polymorphism
		Car c= new AudiCar();  
		c.start();
		c.stop();
		c.cartankSize();
		c.carFuel();
		
		//c.audiFuel(); can't be accessed 
		//only overridden methods can be accessed
	}

}
