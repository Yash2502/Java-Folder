/*Java program for basic string operations like -
 * 1)Converting to Lowercase
 * 2) converting to Uppercase
 * 3) length of the string
 * 3) String reversal
 */

import java.util.Scanner;
public class StringRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();

        // to upper or Lower Case
        System.out.println("In LowerCase - "+str.toLowerCase());
        System.out.println("In Uppercasev- " +str.toUpperCase());    

        //to get the length
        System.out.println("Lenther of string is - "+str.length());

        // to reverse words in a sentence

        StringBuffer stbr = new StringBuffer(str);
        System.out.println("Reversed String is - "+stbr.reverse()); 
        
    
    
    }

}
