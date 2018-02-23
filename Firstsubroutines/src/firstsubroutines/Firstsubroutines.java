/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstsubroutines;

import java.util.regex.*; // Importing Java package to use in the program

/**
 *
 * @author Victor Michael Saltat
 * @university University of the People
 * @project Firstsubroutines
 * @date Feb 23, 2018 @time 12:27:35 PM
 *
 */
public class Firstsubroutines {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        * Your program must prompt the user to enter a string. 
        * The program must then test the string entered by the user to determine whether it is a palindrome. 
        * A palindrome is a string that reads the same backwards and forwards, 
        * such as "radar", "racecar", and "able was I ere I saw elba". It is customary to ignore spaces, 
        * punctuation, and capitalization when looking for palindromes. 
        * For example, "A man, a plan, a canal. Panama!" is considered to be a palindrome.
         */
        String inputstr;
        String stripped;
        String reversed;
        
        TextIO.putln("Please write strings: ");
        inputstr = TextIO.getln();
        
        System.out.println("Your string input is: " + inputstr);
        System.out.println("The result is: ");
        TextIO.putln();
        /*
        * Assign the value of functions to the variables
        */
        stripped = Strip(inputstr);
        reversed = Reverse(stripped);
        /*
        * Print output stripped and reversed
        */
        System.out.println("stripped: " + stripped);
        TextIO.putln();
        System.out.println("reversed: " + reversed);
        TextIO.putln();
        /*
        * Determine if the string is a Palindrome.
        */
        if (stripped.equals(Reverse(stripped))) {
            System.out.println("This IS a palindrome.");
        } else {
            System.out.println("This NOT a palindrome.");
        }
        
        TextIO.putln(); // space
        
    } // end of main()

    static String Strip(String str) {
        /*
        * Strip the string removing not alphabetic character and space
        */
        for (int i = 1; i < str.length(); i++) {
            str = str.replaceAll("[^a-zA-Z]", "");
            str = str.toLowerCase();

        }

        /*
        * Remove the white space
         */
//        if (str.trim().length() > 0) {
//            str = str.replaceAll("[^a-zA-Z]+\\s", "");
//            str = str.toLowerCase();
//        } // done removing whitespace
        /*
        * Try to remove the special character @#~?¿!\| and numbers
         */
//        Pattern pt = Pattern.compile("[^a-zA-Z0-9]");
//        Matcher match = pt.matcher(str);
//            while(match.find()) {
//                str = str.replace(Character.toString(str.charAt(match.start())), "");
//            }
        /*
        
        * Convert to lowercase all character.
         */
//        char ch = str.charAt(0); // convert the first character to char
//        
//        if (ch >= 'A' && ch <= 'Z') { // condition to check if is a capital
//            
//            str = str.toLowerCase();
//            
//        
//        } 
        
        return str; // return the value of String
    } // end of Strip
    
    
    /*
    * Reverse the word after the stripped.
    * 
    */
    public static String Reverse(String str) {
        String reverse;
        int i;
        reverse = "";

        for (i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        return reverse;
    }

}
