/*Java program for calculator using if - else statment 
 Welcome to my calculator
Enter 1st Digit
12
Enter 2nd Digit
23
Add-1  Sub-2    Multi-3    mod-4
Enter the value
4
Division of both number are = 1.9166666666666667
*/


import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome to my calculator");
        System.out.println("Enter 1st Digit ");
        double a= sc.nextDouble();
        System.out.println("Enter 2nd Digit ");
        double b=sc.nextDouble();
        System.out.println("Add-1  Sub-2    Multi-3    Div-4");
        System.out.println("Enter the value");
        int o = sc.nextInt();
        if(o==1){
            System.out.println("Sum of both number are = "+(a+b));
        }
        else if(o==2){
            double d = a-b;
            System.out.println("Difference of both number are = "+ d);
        }
        else if(o==3){
            System.out.println("Product of both number are = "+(a*b));
        }
        else if(o==4){
            System.out.println("Division of both number are = "+(b/a));
        }
        else{
            System.out.println("Value dekh k daal bhai");
        }


    }
    
}
