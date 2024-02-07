/*Java program to find if a number is Even or Odd  */

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("Input is even");
        }
        else{
            System.out.println("Input is Odd");
        }
    }
}
