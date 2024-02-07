import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome to my calculator");
        System.out.println("Enter 1st Digit ");
        double a= sc.nextDouble();
        System.out.println("Enter 2nd Digit ");
        double b=sc.nextDouble();
        System.out.println("Add-1  Sub-2    Multi-3    mod-4");
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
            System.out.println("Mod of both nujmber are = "+(a%b));
        }
        else{
            System.out.println("Value dekh k daal bhai");
        }


    }
    
}
