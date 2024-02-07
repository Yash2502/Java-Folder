/*Java program to count vowels and consonant in a given string 
 Enter the string here : i am going great
Vowels are : I A O I E A 
Vowels count is 6
Conso Count is 7
*/

import java.util.Scanner;
public class countVowels{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string here : ");
        String str = sc.nextLine();
        String cap = str.toUpperCase();
        int count =0;
        int countn =0;
        System.out.print("Vowels are : ");
        for(int i=0;i<cap.length();i++){
            char current = cap.charAt(i);

            if(current == 'A'|| current=='E'||current=='I'||current=='O'|| current=='U'){
                count ++;
                System.out.print(current +" ");
            }
            else if(cap.charAt(i)>='A' && cap.charAt(i)<='Z')
            {
                countn++;

            }
        }
        
        System.out.println("\nVowels count is "+ count);        
        System.out.println("Conso Count is "+ countn);

    }
}