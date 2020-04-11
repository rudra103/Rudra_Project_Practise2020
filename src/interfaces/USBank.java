package interfaces;

public interface USBank {
  
	//by default all the varaibles of interface are publci static final
	int min_bal=100;
	 
	//by default all the methods of interface are publci abstract
	 public abstract void credit();
	 
	 public void debit();
	 
	 public void moneytransfer();
	 
	
}
