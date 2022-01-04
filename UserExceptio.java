package JUNIT.LambdaExpression;

public class UserException extends Exception {
	   
	public ExpectedType type;

	    public enum ExpectedType{
	        FIRSTNAME, LASTNAME, MOBILENUMBER, EMAIL, PASSWORD
	    }

	    public UserException(String message,ExpectedType type) {
	        super();
	        this.type = type;
	    }
	}


