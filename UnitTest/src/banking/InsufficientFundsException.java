package banking;

public class InsufficientFundsException extends Exception {

	    private final int amount;

	    public InsufficientFundsException(int amt) {
	        this.amount = amt;
	    }

	    public int getAmt() {
	        return amount;
	    }
	
}
