package book;

import book.scheme.Sign;
import java.io.IOException;
import java.util.Scanner;

public class Book {
    
    public static boolean book = false;
            
    public static void main(String[] args) throws IOException {
        Scanner message = 
                new Scanner(System.in);
        System.out.println("___.                     __        ");
        System.out.println("\\_ |__    ____    ____  |  | __ ");
        System.out.println(" | __ \\  /  _ \\  /  _ \\ |  |/ / ");
        System.out.println(" | \\_\\ \\(  <_> )(  <_> )|    <  ");
        System.out.println(" |___  / \\____/  \\____/ |__|_ \\ ");
        System.out.println("     \\/                      \\/  \n");
        
        System.out.print("Welcome, Signin or Signup (exit): ");
        String choice = message.nextLine();
        
        choice.toLowerCase();
        if (choice.equals("signin")) { book = true; Impl.file();}
        if (choice.equals("signup")) { book = false; Impl.file();}
        if (choice.equals("exit")) { System.exit(0);}

        
        //Book - book.java
        //    Book.main(null);
    }
}


                   