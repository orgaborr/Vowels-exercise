import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int count = 0;
    
    System.out.println("Input the string: ");
    String string = sc.nextLine();
    
    int length = string.length();
    
    for(int i=0; i<length; i++) {
      char letter = string.charAt(i);
      System.out.println("checking " + letter);
        if(isVowel(letter)) {
          count += 1;
          System.out.println("Vowel found!");
        } else {
          System.out.println("not a vowel");
        }
    }
    
    System.out.println("Number of  Vowels in the string:" + count);
    
    sc.close();
 }
 
 public static boolean isVowel(char letter) {
   if(letter == 'a' || letter == 'e' || letter == 'i' ||
   letter == 'o' || letter == 'u') {
     return true;
   }
   return false;
 }
}
