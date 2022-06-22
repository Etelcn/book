package book;

import static book.Book.book;
import book.scheme.Log;
import book.scheme.Sign;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Impl {
    
    public static String path;
    public static String AbsolutePath;
    
    public static void file() throws IOException{
        Scanner message = 
                new Scanner(System.in);
        
        path = "C:\\Users\\etelc\\Documents\\"
                + "beans\\Book\\src\\book\\scheme\\database.txt";
        File data = new File(path);
        boolean debug = false;
        boolean enabledebugconsole = false;
        /*System.out.print("DEBUG: ");
        String debugcheck = message.nextLine();

        if ("true".equals(debugcheck)) {debug = true;}
        if ("false".equals(debugcheck)) {debug = false;}*/
        AbsolutePath = data.getAbsolutePath();

        if (!data.createNewFile() && debug == true) {System.out.println("Error: file exists already");}
        if (!data.canRead() && debug == true) {System.out.println("Error: no file read access");}
        if (!data.canWrite() && debug == true) {System.out.println("Error: no file write access");}
        if (debug == true) {System.out.println("File path way: " + AbsolutePath);}

        
        if (book == true) {System.out.println("\n\n\n\n\n\n\n"); Log.loggin();}
        else if (book == false) {System.out.println("\n\n\n\n\n\n\n"); Sign.signin();}
        
    }
}
