// Java program to Find Area and Perimeter of the Imagined figures


import java.util.Scanner;

public class PeriOrArea {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Length of the Rectangle");
        int a = sc.nextInt();
        System.out.println("Enter Breadth/Side of the Rectangle/Square");
        int b = sc.nextInt();
        System.out.println("Enter side of the Triangle/Circle ");
        int c = sc.nextInt();

        System.out.println("perimeter of rectangle is - "+2*(a+b));
        System.out.println("Area of rectangle is - "+ (a*b));
        System.out.println("perimeter of square is - "+4*(b));
        System.out.println("area of square is - "+(b*b));
        System.out.println("perimeter of Triangle is - "+(a+b+c));
        System.out.println("Area of Triangle is - "+0.5*(b*c));
        System.out.println("perimeter of Circle is - "+( 2* 3.14* c));

        




    }
    
}
