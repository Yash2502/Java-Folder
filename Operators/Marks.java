/*If the marks of Robert in three subjects are 78,45 and 62 respectively (each out of 100 ), 
write a program to calculate his total marks and percentage marks. */
import java.util.Scanner;
public class Marks {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Marks for Maths - ");
        int m = sc.nextInt();
        System.out.print("Enter Marks for English - ");
        int e= sc.nextInt();
        System.out.print("Enter Marksd for Science - ");
        int s=sc.nextInt();
        System.out.print("Enter Marksd for Social - ");
        int ss=sc.nextInt();
        System.out.print("Enter Marksd for Hindi - ");
        int h=sc.nextInt();

        int total_marks = m+s+e+ss+h;

        int percentage = (total_marks*100)/500;
        System.out.println("Percentage is - "+percentage);
    }
}
