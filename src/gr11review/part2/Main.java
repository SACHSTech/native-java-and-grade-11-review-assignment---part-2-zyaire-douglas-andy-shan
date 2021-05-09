package gr11review.part2;
import java.io.*;
public class Main{
  public static void main (String[] args) throws IOException{
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
	  String input;
	  int result = 0;
	  input = keyboard.readLine();
	  result = sumNumbers(input);
	  System.out.println(result);
		//sumNeumbers("abc123xyz") → 123
  }
}
