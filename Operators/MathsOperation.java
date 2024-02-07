import java.util.Scanner;

public class MathsOperation{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter 1st Number");
            int a = sc.nextInt();
            
            System.out.println("Enter 2nd Number");
            int b = sc.nextInt();

            if (a>b){
                System.out.println("A is greater.");
            }

            else if(a==b){
                System.out.println("both are equal");
            }
            else{
                System.out.println("B is greater.");
            }
            
            System.out.println("Sum of the numbers "+ a + " and " + b + " is = "+ (a+b) );
            System.out.println("Product of the numbers "+ a + " and " + b + " is = "+ (a*b) );
            System.out.println("Average of the numbers "+ a + " and " + b + " is = "+ (a+b)/2 );
            System.out.println("Difference of the numbers "+ a + " and " + b + " is = "+ (a-b) );
            
        }
    }
}