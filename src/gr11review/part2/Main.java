package gr11review.part2;
import java.io.*;

public class Main{
  public static void main (String[] args) throws IOException{
    
    // Methods 1
    String str = "zipXzap";
    System.out.println(Utility.zipZap(str));
    
    //methods 2
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
	  String input;
	  int result = 0;
    System.out.println("Give me a string");
	  input = key.readLine();
	  result = Utility.sumNumbers(input);
	  System.out.println(result);
    
    // FilIO - Read 1
    System.out.println(Utility.longestWord("src/gr11review/test2/Review2_3Test_1.txt"));
    
    //file io2
    String test;
    test = Utility.alphaWord("src/gr11review/part2/FileIO2.txt"); 
    System.out.println("The word that is alphabetically first is " + test); 
    
    // Array 1
    int[] nums = {2, 10, 3, 4, 20, 5};
    nums = Utility.tenRun(nums);
    System.out.println(Arrays.toString(nums));

    //array 2
    int value = 2;
    int[] nums = {1, 2, 3, 2, 5, 2};
    int[] newAry = Utility.notAlone(nums, value);
    for(int i = 0; i < newAry.length; i++){
      System.out.print(newAry[i] + ", ");
    
    // Array 3
    int[] outer = {1, 2, 4, 6};
    int[] inner = {2, 4};
    System.out.println(Utility.linearIn(outer, inner));

    //array 4
    int[] ary = {1, 1, 1, 2, 1};
    System.out.print(Utility.canBalance(ary));
    
    // Array 5
    int i = 1;
    int j = 2;
    System.out.println(Utiliyt.pascalTri(i, j));

    //array 6
    int ntest = 3;
    Utility.diagonal(ntest);
    }
}
