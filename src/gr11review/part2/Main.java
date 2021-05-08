package gr11review.part2;

import java.io.*;
import gr11review.part2.*;

public class Main {
    public static void main(String[] args) throws IOException {
      
     // use this area to test methods from Utility.java
     // create objects
     BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

     // declare variables
     String str;

     // ask for user input of words
     str = keyboard.readLine();

     // use method to zipZap words
     System.out.print(Utility.zipZap(str));
    }
}