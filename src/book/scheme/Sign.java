package book.scheme;

import book.Book;
import static book.Impl.path;
import static book.scheme.Log.usernames;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Sign {
    public static void signin() throws FileNotFoundException, IOException{
        Scanner message = 
                new Scanner(System.in);
            
        System.out.println("        .__    ____                             ");
        System.out.println("  ______|__|  / ___\\  ____       __ __ ______   ");
        System.out.println(" /  ___/|  | / /_/  >/    \\     |  |  \\\\____ \\  ");
        System.out.println(" \\___ \\ |  | \\___  /|   |  \\    |  |  /|  |_> > ");
        System.out.println("/____  >|__|/_____/ |___|  /    |____/ |   __/  ");
        System.out.println("     \\/                  \\/            |__|     \n");
        
        System.out.print("Enter your name: ");
        String name = message.nextLine();
        name.toLowerCase();
        
        System.out.print("Enter your surname: ");
        String surname = message.nextLine();
        surname.toLowerCase();
        
        System.out.print("Create your username: ");
        String username = message.nextLine();
        username.toLowerCase();
        
        System.out.print("Create your password: ");
        String password = message.nextLine();

        File data = new File(path);
        Scanner Buffer = 
                new Scanner(data);
        while(Buffer.hasNext()) {
            String line = Buffer.nextLine();
            String[] values = line.split(",");

            if(values[0].equals(username)) {System.out.print("Username exists!"); Sign.signin();}

        }

        FileWriter fileW = new FileWriter(path, true);
        PrintWriter printW = new PrintWriter(fileW);
            
        printW.print("\n" + username + "," + password + "," + name + "," + surname);
        printW.close();
        
        //Book - book.java
            Book.main(null);
    }
}