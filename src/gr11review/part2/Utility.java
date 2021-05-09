package gr11review.part2;

public class Utility {

  public static int sumNumbers(String str) {
    int sum = 0;
    int count;
    int countAgain;
    for(count = 0; count<str.length(); count++){ //here to check each character
      if(Character.isDigit(str.charAt(count))){//if it is a digit, check the next several digits see if they are or not. so we start at count+1, whcih is the text character
        for(countAgain = count + 1; countAgain < str.lenth(); countAgain++){
          if(!Character.isDigit(str.charAt(count))){//if the chacacter is not a digit, just get rid of it
            break;
          }
        }
        sum += Integer.parseInt(str.substring(count, countAgain));//add the number one by one till the end
        count = countAgain; //after check one time, countAgain is count+1, if the code runs again, since count now euqals to countAgain, countAgain will still bigger than count 1, if we do not have this step, count again will be 2, 3, 4 bigger than count. (the pain of editing this part) 
      }
    }
    return sum;//here we need to return it so that main branch could call it like hihi are u here
  }

  public static String alphaWord(String filenametxt){
    
    return var;
  }
}
