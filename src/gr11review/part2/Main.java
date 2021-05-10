package gr11review.part2;
import java.io.*;
public class Main{
  public static void main (String[] args) throws IOException{
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
	  String input;
	  int result = 0;
    System.out.println("Give me a string");
	  input = key.readLine();
	  result = Utility.sumNumbers(input);
	  System.out.println(result);

    String test;
    test = Utility.alphaWord("src/gr11review/part2/FileIO2.txt"); 

    System.out.println("The word that is alphabetically first is " + test); 
  }
}
