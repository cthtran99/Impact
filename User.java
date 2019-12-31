import java.util.Scanner;


/**
 * Creation of a profile for the new user
 * @author christran
 *
 */
public abstract class User {
	// Creation of the profile for a new User
    private static int createID = 0;
    private int id;
    private String name;
    private String email;
    private String username;
    private String password;
    private String bio;
    private String userType;

    public User(String name, String email, String username, String password, String bio, String userType) {
        createID++;
        this.id = createID;
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
        this.bio = bio;
        this.userType = userType;

    }
/**
 * Get ID of profile
 * @return
 */
    public int getId() {
        return id;
    }
/**
 * Get name of profile
 * @return
 */
    public String getName() {
        return name;
    }
/**
 * get email of profile
 * @return
 */
    public String getEmail() {
        return email;
    }
/**
 * get username of profile
 * @return
 */
    public String getUsername() {
        return username;
    }
/**
 * get password of profile
 * @return
 */
    public String getPassword() {
        return password;
    }
/**
 * get bio of profile
 * @return
 */
    public String getBio() {
        return bio;
    }

    public String getUserType() {return userType;}

    @Override
    public String toString() {
        return  "id=" + id + ", name='" + name + '\'' + ", email='" + email + '\'' +  ", username='" + username + '\'' + ", password='" + password + '\'' + ", bio='" + bio + '\'' + ", userType='" + userType + '\'';
    }
    //Gets the display for new user 
    public void display() {
        int id = getId();
        String name = getName();
        String email = getEmail();
        String username = getUsername();
        String password = getPassword();
        String bio = getBio();
        String userType = getUserType();
        System.out.println("id=" + id + ", name='" + name + '\'' + ", email='" + email + '\'' + ", username='" + username + '\'' + ", password='" + password + '\'' + ", bio='" + bio + '\'' + ", userType='" + userType + '\'' + " ");
    }
}