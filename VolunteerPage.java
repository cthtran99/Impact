/**
 * 
 * @author christran
 * Volunteer page that extends the User class that creates a new user in the form
 * of a Volunteer
 */



public class VolunteerPage extends User {

    private String date;
    private String time;
    private String address;
    private String contact;

    public VolunteerPage(String name, String email, String username, String password, String bio, String date, String time, String address, String contact) 
    {
        super(name, email, username, password, bio,"VolunteerPage");
        this.date = date;
        this.time = time;
        this.address = address;
        this.contact = contact;
    }
    // Returns date
    public String getDate() {
        return date;
    }
    // returns time
    public String getTime() {
        return time;
    }
    // returns address
    public String getAddress() {
        return address;
    }
    // returns contact
    public String getContact() {
        return contact;
    }
    // returns year as an int from string
    public int getYear () {
        String strYear = date.substring(0,4);
        int intYear = Integer.parseInt(strYear);
        return intYear;
    }
    // returns month as an int from string
    public int getMonth () {
        String strMonth = date.substring(5,7);
        int intMonth = Integer.parseInt(strMonth);
        return intMonth;
    }
    
    // returns day as int from string
    public int getDay () {
        String strDay = date.substring(8,10);
        int intDay = Integer.parseInt(strDay);
        return intDay;
    }

    @Override
    public String toString() {
        return super.toString() + "date='" + date + '\'' + ", time='" + time + '\'' + ", address='" + address + '\'' + ", contact='" + contact + '\'';
    }
    //Display information for a volunteer 
    public void display() {
        super.display();
        String date = getDate();
        String time = getTime();
        String address = getAddress();
        String contact = getContact();
        System.out.println(", date='" + date + '\'' + ", time='" + time + '\'' + ", address='" + address + '\'' + ", contact='" + contact + '\'' + " ");
    };

}