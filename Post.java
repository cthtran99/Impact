/**
 * This is for the creation of a post and creating an ID for the post 
 */



public class Post {
    private static int createID = 0;
    private int id;
    private String message;
    private String date;

    public Post(String message) {
        createID++;
        this.id = createID;
        this.message = message;
    }

    public Post(String message,String date) {
        createID++;
        this.id = createID;
        this.message = message;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public String getMessage() {
        return message;
    }
    public int getDay () {
        String stringDay = date.substring(8,10);
        int intDay = Integer.parseInt(stringDay);
        return intDay;
    }
    public int getMonth () {
        String stringMonth = date.substring(5,7);
        int intMonth = Integer.parseInt(stringMonth);
        return intMonth;
    }
    public int getYear () {
        String stringYear = date.substring(0,4);
        int intYear = Integer.parseInt(stringYear);
        return intYear;
    }

    public String toString() {
        return "Post ID "+ id +" [ " + message +" ]";
    }
}


