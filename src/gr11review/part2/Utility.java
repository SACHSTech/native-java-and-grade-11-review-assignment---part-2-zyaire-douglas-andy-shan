package gr11review.part2;
import java.util.Scanner;
import java.io.*;

public class Utility{ 
  
/** 
* This is a program to take out the letter between letters "z" and "p" and returns the String with the removed letters
* @author: Douglas, Lau
*/
public static String zipZap(String str) {// Methods 1

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
  
  /**
  * This is a program to find and add all the numbers from the string
  * @author: Zyaire, Qu
  */
  public static int sumNumbers(String str) {//method 2
    int sum = 0;
    int count;
    int countAgain;
    for(count = 0; count<str.length(); count++){ 
      //here to check each character
      if(Character.isDigit(str.charAt(count))){
        //if it is a digit, check the next several digits see if they are or not. so we start at count+1, whcih is the text character
        for(countAgain = count + 1; countAgain < str.length() && Character.isDigit(str.charAt(countAgain)); countAgain++){
          //we knoe count is a digit so we start at count+1
          //if count again is less than the string length and the count again is a digit, then countagain add itself
        }
        sum += Integer.parseInt(str.substring(count, countAgain));//add the number one by one till the end (sub integers between count and count again )
        count = countAgain; 
        //after check one time, countAgain is count+1, if the code runs again, since count now euqals to countAgain, countAgain will still bigger than count 1, if we do not have this step, count again will be 2, 3, 4 bigger than count. (the pain of editing this part) 
      }
    }
    return sum;//here we need to return it so that main branch could call it like hihi are u here
  }

  /**
  * This is a program that finds the longest word in a file, and returns the longest word
  * @author: Douglas Lau
  */
  public static String longestWord(String filenametxt) throws IOException {// file IO - Read 1
    // declare variables
    String longestWord = "";
    String current;

    // read files
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
  
  /**
  * This is a program to sort the words alphabetly from a file
  * @author: Zyaire, Qu
  */
  public static String alphaWord(String filenametxt) throws IOException{//file io2
    BufferedReader readf = new BufferedReader(new FileReader(filenametxt));
    String words = "";
    String compareOtp = "z";
    while(words != null){//here to read the file
      words = readf.readLine();
      if(words != null && compareOtp.compareToIgnoreCase(words) > 0 ){
        //compare two strings use compareToIgnoreCase, so that if two strings are different, it will returns their difference, which is the value of ASCII. (>0 means compareOtp is greater than words), if the first case are the same, it will compare the second character till the end.
        compareOtp = words; //z is the biggest, if z is greater than words, then replace. 
      }
    }
    readf.close();//close a file after read
    return compareOtp;
  }

  /**
  * This program replaces all numbers to the next highest multiple of 10, and returns the changes numbers
  * @author: Douglas Lau
  */
  public static int[] tenRun(int[] nums) {// Arrays 1 - One Dimensional

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
  
  /**
  * This is a program that makes the letter no more alone 
  * @author: Zyaire, Qu
  */
  public static int[] notAlone(int[] nums, int value){//array 2 not alone
    int count;
    int aryLength = nums.length;//get the length for the loop
    for(count = 1; count < aryLength - 1; count++){//go over the array
      if(nums[count] == value){//to check if the number in the spot is the value we want, if yes, check if the left and right are equal to value
        if(nums[count - 1] != nums[count] && nums[count + 1] != nums[count]){//here we go
          if(nums[count-1] > nums[count +1]){//if left > right, then the count spot number becomes it
            nums[count] = nums[count-1];
          }else if(nums[count - 1] < nums[count + 1]){//vice versa
            nums[count] = nums[count + 1];
          }
        }
      }
    }
    return nums;
  }

/**
* This program determines if numbers in the inner array are present in those in the outer array
* @author: Douglas, Lau
*/
public static boolean linearIn(int[] outer, int[] inner) {// Array 3 - One Dimensional - Two Loops

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
  
  /**
  * This is a program to compare the value of left and side, if they are equal or not
  * @author: Zyaire, Qu
  */
  public static boolean canBalance(int[] nums){//array 4
    int ls = 0;//initialize the values
    int rs = 0;
    int count;
    int countTwo;
    for(count = 0; count < nums.length; count++){//here is the loop
      ls += nums[count];//adding the left side
      rs = 0;//reset because it will be so big
      for(countTwo = nums.length-1; countTwo > count; countTwo--){//adding the right side
        rs += nums[countTwo]; 
      }
      if(ls == rs){//check if correct
        return true;
      }
    }
    return false;
  }
  
/**
* This program adds values top and left in a 2D array to get the value of the next spot on a table
* @author: Douglas, Lau
*/
public static void pascalTri(int i, int j) throws IOException {// Array 5 - Two Dimensional

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
   myWriter = new BufferedWriter(new FileWriter("pascalOut.txt"));
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
  
  /**
  * This is a program that prints a two dimentional array's diagonal
  * @author: Zyaire, Qu
  */
  public static void diagonal(int n) throws IOException{//array6
    int count;
    int countC;
    PrintWriter output = new PrintWriter(new FileWriter("src/gr11review/part2/diagonalOut.txt", true));
    for (count = 0; count < n; count++){ //loop the row
      for (countC = 0; countC < n; countC++){ //loop the column
        if (count + countC < n - 1){ //above the diagonal sicne row+colum<the number n
          output.print("0");
        }else if(count + countC == n - 1){ //row + column if that is euqals to the number n, that is diagonal
          output.print("1");
        }else{
          output.print("2"); //vice versa 
        }
        if (countC != n - 1){ //here to include the comma, 
          output.print(", ");
        }
      }
      output.println(" ");//next row
    }
    output.close();//close the file
  }
}
