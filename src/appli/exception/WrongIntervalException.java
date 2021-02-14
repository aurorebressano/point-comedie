package appli.exception;

public class WrongIntervalException extends Exception {

	private static final long serialVersionUID = 1L;

	// Constructeur avec message
	public WrongIntervalException(String msg) {
		super(msg);		
	}

	public String toString() {
		return super.getMessage();
	}
	
	
}
