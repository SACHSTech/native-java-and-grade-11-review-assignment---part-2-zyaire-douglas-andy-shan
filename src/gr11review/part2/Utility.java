package gr11review.part2;

import java.io.*;
import java.util.Scanner;

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

