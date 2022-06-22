package book.scheme;

import static book.scheme.Log.usernames;
import static book.scheme.Log.names;
import static book.scheme.Log.surnames;

public class Ring {
    
    public static boolean fileverification = false;
    
    public static void ring(){
        if (fileverification == true) {System.out.println("\nWelcome back, " + capitalize(names)  + " " + capitalize(surnames) + " (" + usernames + ")!");}
        if (fileverification == false) {System.out.println("\nError: either username or password is incorrect!");}
    }

    public static String capitalize(String str) {
        if(str == null || str.isEmpty()) {return str;}
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}