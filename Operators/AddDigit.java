import java.util.Scanner;

public class AddDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any four digit Number ");
        int n = sc.nextInt();
        int first,second,third,fourth;
        first = n/1000;
        n = n%1000;

        second = n/100;
        n = n%100;

        third = n/10;
        fourth = n%10;
        System.out.println(first+" "+second+" "+third+" "+fourth);

        //Adding 2 to each number;
        System.out.println("Enter the number you want to add to each digit");
        int d = sc.nextInt();
        System.out.println((first+d)+" "+(second+d)+" "+(third+d)+" "+(fourth+d));
        
        
    }
}
