package JUNIT.LambdaExpression;

import java.util.Scanner;

public class UserRegistration {
	 static String userFirstName = "^[A-Z][a-zA-Z]{3,}";
    static String userLastName = "^[A-Z][a-zA-Z]{3,}";
    static String userEmail = "^[A-Za-z0-9]+(.[A-Za-z0-9]+)*@[^_\\W]+(.[^_\\W]+)?(?=(.[^_\\W]{3,}$|.[a-zA-Z]{2}$)).*$";
    static String userMobileNumber = "^(91)?[7-9][0-9]{9}";
    static String userPassword = "^(?=.*[0-9])(?=.*[!@#$%&^*)_(+}{?>:<]){1}+(?=.*[A-Z])([0-9A-Za-z]).{8,}$";

//First name
    public static UserEntry userentry = (userentry firstname) ->{
        Pattern pattern = Pattern.compile(userFirstName);
        Matcher matcher = pattern.matcher(firstName);
        try {
            if(matcher.matches()) {
                return true;
            }else {
                throw new UserRegistrationException("Enter Valid First Name ", UserRegistrationException.ExpectedType.FIRSTNAME);
            }
        } catch (UserException e) {
            System.out.println(e);
            e.printStackTrace();
            return false;
        }
    };
    
    //LastName
    public static UserEntry userenrty1 = (String LastName) ->{
        Pattern pattern = Pattern.compile(userLastName);
        Matcher matcher = pattern.matcher(LastName);
        try {
            if(matcher.matches()) {
                return true;
            }else {
                throw new UserRegistrationException("Enter Valid LastName", UserRegistrationException.ExpectedType.LASTNAME);
            }
        } catch (UserRegistrationException e) {
            System.out.println(e);
            e.printStackTrace();
            return false;
        }
    };
    
    //MobileNumber
    public static UserEntry userenrty2 = (String MobileNumber) ->{
        Pattern pattern = Pattern.compile(userMobileNumber);
        Matcher matcher = pattern.matcher(MobileNumber);
        try {
            if(matcher.matches()) {
                return true;
            }else {
                throw new UserRegistrationException("Enter Valid MobileNumber", UserRegistrationException.ExpectedType.MOBILENUMBER);
            }
        } catch (UserRegistrationException e) {
            System.out.println(e);
            e.printStackTrace();
            return false;
        }
    };
    
    //Email
    
    public static UserEntry userenrty3 = (String Email) ->{
        Pattern pattern = Pattern.compile(userEmail);
        Matcher matcher = pattern.matcher(Email);
        try {
            if(matcher.matches()) {
                return true;
            }else {
                throw new UserRegistrationException("Enter Valid Email", UserRegistrationException.ExpectedType.EMAIL);
            }
        } catch (UserRegistrationException e) {
            System.out.println(e);
            e.printStackTrace();
            return false;
        }
    };
    
    //Password
    public static UserEntry userenrty4 = (String Password) ->{
        Pattern pattern = Pattern.compile(userPassword);
        Matcher matcher = pattern.matcher(Password);
        try {
            if(matcher.matches()) {
                return true;
            }else {
                throw new UserRegistrationException("Enter Valid Password", UserRegistrationException.ExpectedType.PASSWORD);
            }
        } catch (UserRegistrationException e) {
            System.out.println(e);
            e.printStackTrace();
            return false;
        }
    };

    
    public static void main(String[] args) {


        Scanner scannerObject = new Scanner(System.in);

        System.out.println("Enter Your First Name");
        String firstName = scannerObject.next();
        try {
        	UserEntry.UserEntry(firstName);
        } catch (UserException e) {
            e.printStackTrace();
        }
        System.out.println("Enter Your Last Name");
        String LastName = scannerObject.next();
        try {
        	UserEntry.UserEntry1(LastName);
        } catch (UserException e) {
            e.printStackTrace();
        }
        System.out.println("Enter Your Mobilenumber");
        String Mobilenumber = scannerObject.next();
        try {
        	UserEntry.UserEntry2(Mobilenumber);
        } catch (UserException e) {
            e.printStackTrace();
        }
        System.out.println("Enter Your password");
        String password = scannerObject.next();
        try {
        	UserEntry.UserEntry3(password);
        } catch (UserException e) {
            e.printStackTrace();
        }
        System.out.println("Enter Your Email");
        String Email = scannerObject.next();
        try {
        	UserEntry.UserEntry4(Email);
        } catch (UserException e) {
            e.printStackTrace();
        }
    }
    }
        


    
    



