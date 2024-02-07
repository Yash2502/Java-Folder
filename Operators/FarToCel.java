/*Java Program to convert temprature form fahrenite to Celcius */

import java.util.Scanner;

public class FarToCel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the tempratrure ");
        float far = sc.nextFloat();
        float cel = (far-32) * 5/9;
        System.out.println("Temprature in Fahrenite is - " +far);
        System.out.println("Temprature in Celcius is - " +cel);

    }
}
