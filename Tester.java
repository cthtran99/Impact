  
import java.time.LocalDate;
import java.util.*;


/**
 * 
 * @author chris tran
 * The tester for the Impact program that will allow users to create an account page as
 * an individual, organization, or a volunteer
 * As a individual they will be able to donate, Post updates, register for events
 * As a Organization they will be able to post updates
 * As a volunteer they will be able to post and create events
 */
public class Tester {


    public static void main(String[] args) {

    	// Creates array list for user/ our feed/ and new events
        ArrayList<User> Users = new ArrayList<User>();
        ArrayList<Post> feed = new ArrayList<Post>();
        ArrayList<User> Events = new ArrayList<>();


        LocalDate t = LocalDate.now();
        Date today = new Date(t.getYear(),t.getMonthValue(),t.getDayOfMonth());


        //Test Individual
        Individual JaneDoe = new Individual("Jane Doe", "jdoe@csulb.edu", "SerengetiJane", "XxX123", "Biology major @CSULB. Lover of the outdoors and anything creepy crawly", "08/16/1997", "None");
        Users.add(JaneDoe);
        Individual MateoStevens = new Individual("Mateo Stevens", "mathmatt03@gmail.com", "MathMatt", "fortniteislifejk", "Books, pizza, and camping trips please", "05/03/2005", "(Do not ask for underage user)");
        Users.add(MateoStevens);
        // Test Organization
        Organization Nature = new Organization("World Wide Fund for Nature", "wwf@gmail.com", "WWF", "1234", "Working to conserve nature and reduce the most pressing threats the diversity of life on Earth", "1250 24th Street, N.W. Washington, DC 20037", "(202) 293-4800", "52-1693387", "#: 1234 5678 9012");
        Users.add(Nature);
        Organization gScout = new Organization("Girl Scouts of the USA", "gsusa@gmail.com", "GirlScoutsUSA", "12345", "Offering the best leadership development experience for girls in the world", "420 Fifth Avenue at 37th treet - GRO Floor", "(800) 478-7248", "13-1624016", "#:9999 0000 1111 2222");
        Users.add(gScout);
        // test volunteer
        VolunteerPage SealBeach = new VolunteerPage("Seal Beach Clean-Up", "saveSealBeach@gmail.com", "SealBeachCleanUp", "sSBcup", "A group of caring neighbors looking out for our beaches.", "10/12/2019 - 10/13/2019", "9am - noon", "Seal Beach Municipal Pier, Old Towne, CA 90740", "#: (562) 555-5555");
        Users.add(SealBeach);
        Events.add(SealBeach);
        
        
        // test post
        Post testPost1 = new Post("Post A");
        feed.add(testPost1);

        // makes the while loop run. It is set to 0 to stop the process
        int stop = 1;

        System.out.println("Welcome to Impact");

        // While loop runs while stop is not 0
        do {

        // Menu Creation
        Menu nav = new Menu();
        nav.mainMenu();

        // User input
        Scanner scan = new Scanner(System.in);
        System.out.println("Option: ");
        String menuChoice = scan.nextLine();
        	
        	//create a user
            if (menuChoice.equalsIgnoreCase("C")) {
            nav.userMenu();
            String userChoice = scan.nextLine();
            
            //Creates an individual
            if (userChoice.equalsIgnoreCase("I")) {

                System.out.println("Enter Name: ");
                String name = scan.nextLine();
                System.out.println("Enter Email: ");
                String email = scan.nextLine();
                System.out.println("Enter Username: ");
                String username = scan.nextLine();
                System.out.println("Enter Password: ");
                String password = scan.nextLine();
                System.out.println("Enter Bio: ");
                String bio = scan.nextLine();
                System.out.println("Enter Date of Birth: ");
                String dob = scan.nextLine();
                System.out.println("Enter Bank Account: ");
                String bankAccount = scan.nextLine();
                Individual i = new Individual(name,email,username,password,bio,dob,bankAccount);

                Users.add(i);
                String iUser = i.getUsername();
                // Post the new individual username in the feed
                Post newIndividualPost = new Post (iUser + " is a new individual user. Welcome to impact! ");
                feed.add(newIndividualPost);
              
                
                // Creates an organization
            } else if (userChoice.equalsIgnoreCase("O")) {
                // add and create a new organization to the list of all users

                System.out.println("Enter your Name: ");
                String name = scan.nextLine();
                System.out.println("Enter Email: ");
                String email = scan.nextLine();
                System.out.println("Enter Username: ");
                String username = scan.nextLine();
                System.out.println("Enter Password: ");
                String password = scan.nextLine();
                System.out.println("Enter Bio: ");
                String bio = scan.nextLine();
                System.out.println("Enter Mailing: ");
                String mailing = scan.nextLine();
                System.out.println("Enter Phone: ");
                String phone = scan.nextLine();
                System.out.println("Enter Tax ID: ");
                String tax = scan.nextLine();
                System.out.println("Enter Bank Account: ");
                String bankAccount = scan.nextLine();
                Organization org = new Organization(name,email,username,password,bio,mailing,phone,tax,bankAccount);

                Users.add(org);
                String orgName = org.getName();
                // Post the new organization name in the feed
                Post newOrganizationPost = new Post (orgName + " is a new organization. Welcome to impact! ");
                feed.add(newOrganizationPost);


            } else if (userChoice.equalsIgnoreCase("V")) {

                // Creates volunteer
                System.out.println("Enter Name: ");
                String name = scan.nextLine();
                System.out.println("Enter Email: ");
                String email = scan.nextLine();
                System.out.println("Enter Username: ");
                String username = scan.nextLine();
                System.out.println("Enter Password: ");
                String password = scan.nextLine();
                System.out.println("Enter Bio: ");
                String bio = scan.nextLine();
                System.out.println("Enter Date: ");
                String date = scan.nextLine();
                System.out.println("Enter Time: ");
                String time = scan.nextLine();
                System.out.println("Enter Address: ");
                String address = scan.nextLine();
                System.out.println("Enter Contact: ");
                String contact = scan.nextLine();
                VolunteerPage v = new VolunteerPage(name,email,username,password,bio,date,time,address,contact);

                Users.add(v);
                // Adds new events to array list 
                Events.add(v);
                // Adds the event to feed
                String eventName = v.getName();
                String eventAddress = v.getAddress();
                String eventDate = v.getDate();
                String eventTime = v.getTime();
                Post newVolunteerPagePost = new Post (eventName + " is a event available in Impact! Address: "+eventAddress+" on "+eventDate+" at "+eventTime,eventDate);
                feed.add(newVolunteerPagePost);

            } else {
                System.out.println("Not a valid option");
              
            }
            
            
            // Option to use already added accounts in database
        } else if (menuChoice.equalsIgnoreCase("A")) {
            System.out.println("Select the account you want to use: \n");
            for (int i = 0; i < Users.size() ; i++) {
                System.out.println(Users.get(i));
            }
            System.out.println("Select a user by entering the ID: \n");
            int selectedId = Integer.parseInt(scan.nextLine().trim());

            // Gets the username of user selected
            User selectedUser = Users.get(selectedId-1);


            System.out.println("You selected: "+ selectedUser.getUsername());


            if (Users.get(selectedId-1).getUserType() == "Individual") {
            nav.individualMenu();
            } else if (Users.get(selectedId-1).getUserType() == "Organization") {
                nav.organizationMenu();
            } else if (Users.get(selectedId-1).getUserType() == "VolunteerPage") {
                nav.eventMenu();
            } else {
                System.out.println("Invalid Option");
            }

// making a post
            String option = scan.nextLine();
            if (option.equalsIgnoreCase("P")){
                System.out.println("Enter the message you want to post: ");
                String message = scan.nextLine();
                System.out.println("Do you want to enter a file? (Y/N)");
                String fileQuestion = scan.nextLine();
                if (fileQuestion.equalsIgnoreCase("Y")) {
                    System.out.println("Enter a file: ");
                    String file = scan.nextLine();
                    // create message with file
                    String messagePost = selectedUser.getUsername() + " posted: " + message + "and a file: " +file;
                    Post newPost = new Post (messagePost);
                    feed.add(newPost);
                } else if (fileQuestion.equalsIgnoreCase("N")){
                    // create message without file
                    String messagePost = selectedUser.getUsername() + " posted: " + message;
                    Post newPost = new Post (messagePost);
                    feed.add(newPost);
                } else {
                    System.out.println("Invalid Option");
                }

                //Make an event
            } else if (option.equalsIgnoreCase("M")){
                System.out.println("Enter a new date for the event");
                String newDate = scan.nextLine();
                String eventDate = selectedUser.getName() + "changed the event date to: " + newDate;
                Post eventDatePost = new Post (eventDate);
                feed.add(eventDatePost);
       
                
                
                // Registration of an event
            }else if (option.equalsIgnoreCase("R")){
                System.out.println("Registering for an event");
                // get a list of all the events
                for (int i = 0; i < Events.size(); i++) {
                    int j = i +1 ;
                    System.out.println("Option: "+j+" Event Name: "+ Events.get(i).getName());
                }

                // ask the user what event they want to register using the ID
                System.out.println(" ");
                System.out.println("Select an event by entering the ID: ");

                int selectedEventId = Integer.parseInt(scan.nextLine().trim());

                User selectedEvent = Events.get(selectedEventId-1);
                System.out.println("Event Selected: "+ selectedEvent.getName());

                // create message
                String message = selectedUser.getUsername() + " has registered to " + selectedEvent.getName();
                // make a new post object
                Post newRegistration = new Post (message);
                // add the new post object to the feed
                feed.add(newRegistration);
                System.out.println("User "+selectedUser.getUsername()+" is registered to "+selectedEvent.getName());
                
                
                // lets user return to menu
            } else if (option.equalsIgnoreCase("E")){
                System.out.println("Returning to the main menu");
                
                
                //Allows an Individual to donate to other accounts
            } else if (option.equalsIgnoreCase("S")){
            	System.out.println("What user do you want to donate to?");
            	for (int i = 0; i < Users.size() ; i++) {
                    System.out.println(Users.get(i));
                }
                System.out.println("Select a user by entering the ID: \n");
                int chooseID = Integer.parseInt(scan.nextLine().trim());

                // gets the user name associated with the id selected
                User chooseUser = Users.get(selectedId-0);
            	System.out.println("How much do you want to donate");
            	int Donation = scan.nextInt();


                System.out.println("You donated: " + Donation + " to the account of " + chooseUser.getUsername());
                String postDonation = (selectedUser.getUsername() +" donated: " + Donation + " to the account of " + chooseUser.getUsername());
            	Post newDonation = new Post(postDonation);
            	feed.add(newDonation);
            	
            } else {
                System.out.println("Not a valid option");

            }


        } else if (menuChoice.equalsIgnoreCase("D")) {
        System.out.println("Displaying Feed\n");
        for (int i = 0; i < feed.size(); i++) {
            if ( feed.get(i).getDate() == null) {
                System.out.println(feed.get(i));
                System.out.println(" ");
            } else {
                // get date of the post
                int pYear = feed.get(i).getYear();
                int pMonth = feed.get(i).getMonth();
                int pDay = feed.get(i).getDay();
                Date dateCompare = new Date(pYear, pMonth,pDay);

                int result = dateCompare.compareTo(today);
                if (result == 1 ) {
                    System.out.println(feed.get(i));
                    System.out.println(" ");
                } else if (result == 0) {
                    System.out.println(feed.get(i));
                    System.out.println(" ");
                }

            }

        }

        } else if (menuChoice.equalsIgnoreCase("Q")) {
            System.out.println("Impact has ended");
            stop = 0;
        }

        else {
            System.out.println("Invalid, choose a valid option");
        }

        }
        // Ends the while loop, ending the program
        while (stop == 1);
    }
}