package interfaces;

public class TestInterface extends HsbcBank 
{

	public static void main(String[] args) {
		
		TestInterface t=new TestInterface();
		
        //Subclass object created referring Super class 
		//USBank t = new HsbcBank();
		t.credit();
		t.debit();
		t.moneytransfer();
		//t.eduLoan();
		
		
	}

}
