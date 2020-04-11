package interfaces;

public class HsbcBank implements USBank 
{

	public  void credit()
	{
		System.out.println("Credit ..");
	}
	 
	 public void debit()
	 {
		 System.out.println("Debit ..");
	 }
	 
	 public void moneytransfer()
	 {
		 System.out.println("money transfer ..");
	 }
	 public void educLoan()
	 {
		 System.out.println("Edu Laoan.. ..");
	 }
}
