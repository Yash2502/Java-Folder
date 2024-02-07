/*Java code to add desired number to every digit of input.

Input - 
Enter any four digit Number 
1234
1 2 3 4
Enter the number you want to add to each digit
2

Output- 
Adding 2 to every digit we get -
3 4 5 6
*/

import java.util.Scanner;

public class AddDigitsInInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any four digit Number ");
        int n = sc.nextInt();
        int first,second,third,fourth;
        first = n/1000;
        n = n%1000;

        second = n/100;
        n = n%100;

        third = n/10;
        fourth = n%10;
        System.out.println("Digits of your inputs are - "+first+" "+second+" "+third+" "+fourth);

        //Adding 2 to each number;
        System.out.println("Enter the number you want to add to each digit");
        int d = sc.nextInt();
        System.out.println("Adding "+d +" to every digit we get - ");
        System.out.println((first+d)+" "+(second+d)+" "+(third+d)+" "+(fourth+d));
        
        
    }
}
