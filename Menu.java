/**
 * 
 * @author christran
 * A class for all the different menus used in the Impact program
 */
public class Menu {
    public Menu() {
    }
    
    /**
     * The main menu for allowing input in creating a new user
     * Or act as a user / Display feed
     */
    public void mainMenu() {

        System.out.println("Main menu\n");
        System.out.println("Please select one of the following");
        System.out.println("C) Create new user");
        System.out.println("A) Act as a user");
        System.out.println("D) Display feed");
        System.out.println("Q) Quit\n");


    }
    /**
     * Menu for the creation of a new account
     */
    public void userMenu() {
        System.out.println(" ");
        System.out.println("Creating new user");
        System.out.println("What kind of user do you want to create?");
        System.out.println("I) Individual");
        System.out.println("O) Organization");
        System.out.println("V) Volunteer\n");


    }
    /**
     * Menu for the creation of an Individual
     */
    public void individualMenu() {

        System.out.println("What do you want to do as the individual: ");
        System.out.println("P) Post Update");
        System.out.println("S) Make Donation");
        System.out.println("R) Register for Event");
        System.out.println("E) Exit to main\n");


    }
    /**
     * Menu for the creation of an Organization
     */
    public void organizationMenu() {

        System.out.println("What do you want to do as an organization");
        System.out.println("P) Post Update");
        System.out.println("E) Exit to main\n");

    }
    /**
     * Menu for the creation of a new event
     */
    public void eventMenu() {

        System.out.println("What do you want to do to the event");
        System.out.println("P) Post Update");
        System.out.println("M) Modify Date / Time / Location");
        System.out.println("E) Exit to main\n");
    }

}