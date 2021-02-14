package appli.exception;

public class NullStartDateException extends Exception {

	private static final long serialVersionUID = 1L;
	
	// Constructeur avec message
	public NullStartDateException(String msg) {
		super(msg);		
	}

	public String toString() {
		return super.getMessage();
	}
}
