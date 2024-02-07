//Java code to sum up all input digits into a single digit
/*It will return single digit after adding all the digits in the given input.
Input - 234
Output - 9
Logic - 1+(234-1)%9 = 1+(233%9) = 1+8 =9
*/

import java.util.Scanner;

public class AddInput {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Input ");
    int Digit = sc.nextInt(); 

    int ans = 1+(Digit-1)%9;
    System.out.println("Sum of all input Digits are - "+ans);

}

}
