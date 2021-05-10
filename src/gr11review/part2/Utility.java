package gr11review.part2;

import java.io.*;

public class Utility {

// Methods 1
public static String zipZap(String str) {

  // declare variables
  String zapStr = "";

  // zipZap letter between "z" and "p" 
  for (int i = 0; i < str.length(); i++) {
    if ((i < str.length() - 2) && (str.substring(i, i + 1).equals("z")) && (str.substring(i + 2, i + 3).equals("p"))) {
      zapStr += "zp";
      i += 2;
    }
    else
     zapStr += str.substring(i, i + 1);
  }

  // return the zapped string
  return zapStr;
}

  // file IO - Read 1
  public static String longestWord(String filenametxt) throws IOException {

    // declare variables
    String longestWord = "";
    String current;

    // scan files
    File theFile = new File(filenametxt);
    BufferedReader br = new BufferedReader(new FileReader(theFile));

    // determine longest word in the file
    while ((current = br.readLine()) != null) {
        if (current.length() >= longestWord.length()) {
            longestWord = current;
        }
    }
    br.close();

    // return the longest word
    return longestWord;
    }

  // Arrays 1 - One Dimensional
  public static int[] tenRun(int[] nums) {

    // declare variables
    int current;
    int i = 0;
      
    // determine if num is a mulitple of 10 and replace all other nums after until finding a num that is a greater multiple of 10
    while(i < nums.length && nums[i] % 10 != 0)
        i++;
     if(i >= nums.length)
        return nums;                
    current = nums[i]; 
    i++;
                                
    while(i < nums.length) {
        if(nums[i] % 10 == 0)
            current = nums[i];
        else
            nums[i] = current;
        i++;
    }
    return nums; 
}

// Array 3 - One Dimensional - Two Loops
public static boolean linearIn(int[] outer, int[] inner) {

  // declare variables
  int numFound = 0;
  int k = 0;

  // if the length of the inner array is 0, it will always return true
  if(inner.length == 0) {
     return true;
  }
  
  // determine if the integers in the outer array are present in the inner array. 
  // if they are the present, return true. otherwise return false. 
  for(int i = 0; i < outer.length; i++) {
     if(outer[i] == inner[k]) {
        numFound++;
        k++;
     } else if(outer[i] > inner[k]) {
        return false;
     }
     
     if(numFound == inner.length)
        return true;
  }

  // if nothing is found, return false
  return false;
}

// Array 5 - Two Dimensional
public static void pascalTri(int i, int j) throws IOException {

  // declare variables
  int[][] num;

  // determine the numbers in the Pascal triangle
  num = new int[i][j];
  for (int countH = 0; countH < i; countH++) {
    for (int countV = 0; countV < j; countV++) {
      if (countV == 0 || countH == 0) {
        num[countH][countV] = 1;
      }
       else {
        num[countH][countV] = num[countH][countV - 1] + num[countH - 1][countV];
      }
    }
  }

  // display the numbers in pascalOut.textFile
   BufferedWriter myWriter = null;
   myWriter = new BufferedWriter(new FileWriter("src/gr11review/part2/pascalOut.txt"));
   for (int countH = 0; countH < i; countH++) {
     for (int countV = 0; countV <= j; countV++) {
       if (countV == j) {
         myWriter.write("\n");
       }
       else {
         myWriter.write(num[countH][countV] + "");
         if (countV < j - 1) {
           myWriter.write(",");
         }
       }
     }
   }
   myWriter.close();
}
}