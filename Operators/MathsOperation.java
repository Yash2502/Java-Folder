/*Java program to find the greatest numbers among the Input. */

import java.util.Scanner;

public class MathsOperation{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter 1st Number");
            int a = sc.nextInt();
            
            System.out.println("Enter 2nd Number");
            int b = sc.nextInt();

            System.out.println("Enter 3rd Number");
            int c = sc.nextInt();

            if (a>b && a>c){
                System.out.println("A is greater.");
            }

            else if(b>c &&b>a){
                System.out.println("B is greater.");
            }

            else if(c>a && c>b){
                System.out.println("C is greater ");
            }
            else if(a==b && b==c){
                System.out.println("All are equal");
            }
            else if(a==b && b>c){
                System.out.println(" Both A and B are greater the C ");
            }
            else if(a==c && a>b){
                System.out.println(" Both A and C are greater the B ");
            }
            else if(b==c && b>a){
                System.out.println(" Both B and C are greater the A ");
            }
            else{
                System.err.println("Please enter a valid input ");
            }
            
        }
    }
}