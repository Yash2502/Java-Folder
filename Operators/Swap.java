/*Java program to swap two numbers using -
 * 1) a temporary variable
 * 2) using + & - operator
 * 3) using * & / operator
 */

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter valur of A");
        int a = sc.nextInt();
        System.out.println("Enter valur of B");
        int b =sc.nextInt();
      
        /*  Using Temporary varaibale 
        int temp = 0;
        temp = a;
        a=b;
        b=temp; */

        //Before Swapping
        System.out.println("Before Swapping ");
        System.out.println("value of A is "+a);
        System.out.println("value of B is "+b);

        //Logic using operators

        a = a+b;        //a = a*b;
        b = a-b;        //b = a/b;
        a = a-b;        //a = a/b;
        
       // After Swapping
       System.out.println("After Swapping");
        System.out.println("Now A is "+a);
        System.out.println("Now B is "+b);

    }
    
}
