package JUNIT.LambdaExpression;

public class UserEntry{
@FunctionalInterface
   interface FirstName {
    public boolean FirstName(String firstName) throws Exception;
   }
   interface LastName {
    public boolean LastName(String LastName) throws Exception;
   }
    interface Mobilenum {
        public boolean Mobilenum(String Mobilenum) throws Exception;
    }
    interface Password {
        public boolean Password(String Password) throws Exception;
    }
    interface Email {
        public boolean Email(String Email) throws Exception;
    
    }
	public static String UserEntry(String firstName) {
return (firstName);		
	}
	public static String UserEntry1(String LastName) {
		return (LastName);		
		
	}
	public static String UserEntry2(String mobilenumber) {
		return (mobilenumber);		
		
	}
	public static String UserEntry3(String password) {
		return (password);		
		
	}
	public static String UserEntry4(String email) {
		return (email);		
	}   
}
 
 

