import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * 
 * @author christran
 * Class for the creation of an individual
 */
public class Individual extends User{
    private static String type = "individual";
    private String DateOfBirth;
    private String bankAccount;
    private String userType;

    public Individual(String name, String email, String username, String password, String bio, String DateOfBirth, String bankAccount) {

        super(name, email, username, password, bio, "Individual");
        this.DateOfBirth = DateOfBirth;
        this.bankAccount = bankAccount;
        this.userType = type;
    }
/**
 * 
 * @return
 * returns the date of birth of Individual
 */
    public String getDob() {
        return DateOfBirth;
    }
/**
 * returns Bank account for an individual
 * @return
 */
    public String getBankAccount() {
        return bankAccount;
    }
/**
 * returns the year as an int
 * @return
 */
    public int getYear () {
        String stringYear = DateOfBirth.substring(0,4);
        int intYear = Integer.parseInt(stringYear);
        return intYear;
    }
    
/**
 * returns month as an int
 * @return
 */
    public int getMonth () {
        String stringMonth = DateOfBirth.substring(5,7);
        int intMonth = Integer.parseInt(stringMonth);
        return intMonth;
    }
    
    /**
     * returns day as an int
     * @return
     */
    
    public int getDay () {
        String stringDay = DateOfBirth.substring(8,10);
        int intDay = Integer.parseInt(stringDay);
        return intDay;
    }
    
    /**
     * displays information about individual
     */

    public void display(){
       super.display();
       String dateOfBirth = getDob();
       String bankAcct = getBankAccount();
       String userType = getUserType();
       System.out.println("dateOfBirth=" + dateOfBirth + ", bankAccount='" + bankAcct + '\'' + ", userType='" + userType + '\'' +" ");
    }

    @Override
    /**
     * makes string for individual
     */
    public String toString() {
        return  (super.toString() + "dob='" + DateOfBirth + '\'' + ", bankAccount='" + bankAccount + '\'' + ", userType='" + userType + '\'');
    }
}