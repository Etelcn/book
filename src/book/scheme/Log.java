package book.scheme;

import static book.Impl.path;
import static book.scheme.Ring.fileverification;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Log {
    
    public static String usernames;
    public static String names;
    public static String surnames;
    
    public static void loggin() throws FileNotFoundException{
        Scanner message = 
                new Scanner(System.in);
        
        System.out.println("        .__    ____             .__          ");
        System.out.println("  ______|__|  / ___\\  ____      |__|  ____   ");
        System.out.println(" /  ___/|  | / /_/  >/    \\     |  | /    \\  ");
        System.out.println(" \\___ \\ |  | \\___  /|   |  \\    |  ||   |  \\ ");
        System.out.println("/____  >|__|/_____/ |___|  /    |__||___|  / ");
        System.out.println("     \\/                  \\/              \\/  \n");
        
        System.out.print("Enter your username: ");
        String username = message.nextLine();
        
        System.out.print("Enter your password: ");
        String password = message.nextLine();

        File data = new File(path);
        Scanner Buffer = 
                new Scanner(data);
        while(Buffer.hasNext()) {
            String line = Buffer.nextLine();
            String[] values = line.split(",");

            if(values[0].equals(username) && values[1].equals(password)) { fileverification = true;}
            names = values[2];
            surnames = values[3];
            
        }
        
        //ring - Ring.java
        usernames = username;
            Ring.ring();
    }
    
    
}