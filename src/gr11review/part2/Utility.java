package gr11review.part2;
import java.util.Scanner;
import java.io.*;
public class Utility {
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

  public static boolean canBalance(int[] nums){//array 4
    

  }
}
