/*Java Program to find reverse of the given number  and check if it is Palindrome or not. */

import java.util.Scanner;
class palindrome {
    public static void main(String[] agrs) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number ");
        int x = sc.nextInt();
        int reversed = 0;
        int temp = x;

        while (temp != 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        System.out.println("Reverse number is - "+reversed);
        if(reversed==x){
            System.out.println("Palidrome");
        }
        else{
            System.out.println("Not Plaindrome");
        }

    }
}