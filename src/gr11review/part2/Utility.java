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
}