package gr11review.part2;

import java.io.*;
import gr11review.part2.*;

public class Main {
    public static void main(String[] args) throws IOException {
      
     // Methods 1
     String str = "zipXzap";
     System.out.println(Utility.zipZap(str));

     // FilIO - Read 1
     System.out.println(Utility.longestWord("src/gr11review/test2/Review2_3Test_1.txt"));

     // Array 1
     int[] nums = {2, 10, 3, 4, 20, 5};
     nums = Utility.tenRun(nums);
     System.out.println(Arrays.toString(nums));

     // Array 3
     int[] outer = {1, 2, 4, 6};
     int[] inner = {2, 4};

     System.out.println(Utility.linearIn(outer, inner));

     // Array 5
     int i = 1;
     int j = 2;
     System.out.println(Utiliyt.pascalTri(i, j));
    }
}