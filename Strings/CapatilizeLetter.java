/*java Program to make every single word's first character as Capital
 * Input - hello! you are welcome
 * Output - Hello! You Are Welcome
 */

import java.util.Scanner;
public class CapatilizeLetter{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the String ");
       String str = sc.nextLine();

       String[] parts = str.split(" ");
       for(int i=0; i<parts.length;i++){
        parts[i] = parts[i].substring(0, 1).toUpperCase() + parts[i].substring(1);
        System.out.print("Output - "+parts[i]+" ");
       }

    }
}