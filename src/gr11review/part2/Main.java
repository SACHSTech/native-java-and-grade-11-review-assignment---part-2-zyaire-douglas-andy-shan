package gr11review.part2;
import java.io.*;
public class Main{
  public static void main (String[] args) throws IOException{
    //methods 2
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
	  String input;
	  int result = 0;
    System.out.println("Give me a string");
	  input = key.readLine();
	  result = Utility.sumNumbers(input);
	  System.out.println(result);

    //file io2
    String test;
    test = Utility.alphaWord("src/gr11review/part2/FileIO2.txt"); 
    System.out.println("The word that is alphabetically first is " + test); 

    //array 2
    int value = 2;
    int[] nums = {1, 2, 3, 2, 5, 2};
    int[] newAry = Utility.notAlone(nums, value);
    System.out.println(newAry);
  }
}
