package piglatin;
import java.util.Scanner;

/**
 * OBJECTIVE: Translate phrase to pig Latin
 * @author HLC
 */
public class PigLatin {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a phrase: ");
        System.out.println("Pig latin translation: " + translate(keyboard.nextLine()));
    }
 
    public static String translate(String word) {
        if(word.length() > 0){
            char firstLetter = word.charAt(0);
            String newWord = "";
            for(int i = 1; i < word.length(); i++){
               if (!Character.isWhitespace(word.charAt(i))) {
                   if (Character.isWhitespace(word.charAt(i-1))) {
                       firstLetter = word.charAt(i);
                   } else if (i == word.length()-1 || Character.isWhitespace(word.charAt(i+1))) {
                       newWord += Character.toString(word.charAt(i)) + Character.toString(firstLetter) + "ay ";
                   } else {
                       newWord += Character.toString(word.charAt(i));
                   }
               }
            }
            return newWord.toLowerCase();
        } else {
            return ("Bad input");
        }
    }
}